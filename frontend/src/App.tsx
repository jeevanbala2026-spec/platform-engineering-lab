import { useCallback, useEffect, useState } from 'react'
import './App.css'

type GreetingResponse = {
  message: string
  status: string
}

export default function App() {
  const [name, setName] = useState('Jeeva')
  const [greeting, setGreeting] = useState('Loading greeting...')
  const [health, setHealth] = useState('Loading service status...')
  const [loading, setLoading] = useState(false)
  const [error, setError] = useState<string | null>(null)

  const loadData = useCallback(async () => {
    setLoading(true)
    setError(null)

    try {
      const greetingResponse = await fetch(`/api/hello?name=${encodeURIComponent(name)}`)
      const greetingData: GreetingResponse = await greetingResponse.json()

      const healthResponse = await fetch('/api/health')
      const healthData: GreetingResponse = await healthResponse.json()

      setGreeting(greetingData.message)
      setHealth(healthData.status)
    } catch {
      setError('Unable to reach the backend API.')
    } finally {
      setLoading(false)
    }
  }, [name])

  useEffect(() => {
    void loadData()
  }, [loadData])

  return (
    <main className="page">
      <section className="hero">
        <p className="eyebrow">Platform Engineering Lab</p>
        <h1>Spring Boot + React</h1>
        <p className="subtitle">
          A small full-stack sample with a Spring Boot backend and a React frontend.
        </p>

        <div className="card">
          <label htmlFor="name">Name</label>
          <div className="row">
            <input
              id="name"
              value={name}
              onChange={(event) => setName(event.target.value)}
              placeholder="Enter your name"
            />
            <button onClick={() => void loadData()} disabled={loading}>
              {loading ? 'Loading...' : 'Refresh'}
            </button>
          </div>

          <div className="result">
            <div>
              <span className="label">Greeting</span>
              <strong>{greeting}</strong>
            </div>
            <div>
              <span className="label">Health</span>
              <strong>{health}</strong>
            </div>
          </div>

          {error ? <p className="error">{error}</p> : null}
        </div>
      </section>
    </main>
  )
}