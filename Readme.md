# Platform Engineering Lab

This repository is a hands-on practice space for Git, GitHub, Azure DevOps, and Terraform.

The main goal is to build practical confidence with production-style workflows used in enterprise delivery environments.

## Purpose

This lab is designed to help me:

- refresh core Git knowledge
- practice feature branch and pull request workflows
- learn Azure DevOps repositories and pipelines
- understand Terraform automation in CI/CD
- build confidence working with standard DevOps repository structures

## Focus Areas

### Git

- working directory, staging area, commit history, and HEAD
- common commands such as `clone`, `add`, `commit`, `push`, `pull`, `fetch`, `branch`, `switch`, and `merge`
- history inspection with `log`, `diff`, `show`, and `blame`
- recovery and cleanup with `restore`, `revert`, `reset`, `rebase`, `stash`, `cherry-pick`, and `reflog` 
- resolving merge conflicts safely

### GitHub

- repository navigation
- pull requests and code review flow
- branch protection rules
- CODEOWNERS
- secrets management
- releases and tags

### Azure DevOps

- Repos, Pipelines, Boards, Artifacts, and Test Plans
- YAML pipeline structure
- triggers, stages, jobs, and agents
- service connections
- environment variables and approval gates
- classic pipeline awareness

### Terraform

- infrastructure as code structure and conventions
- reusable modules
- environment separation for `dev`, `stage`, and `prod`
- remote state best practices
- pipeline-driven execution of `terraform init`, `terraform validate`, `terraform plan`, and `terraform apply`

## Learning Outcomes

By the end of this lab, I want to be able to:

- work comfortably with Git in day-to-day delivery
- create and manage feature branches correctly
- open and review pull requests
- read and author Azure DevOps YAML pipelines
- connect Terraform workflows to CI/CD pipelines
- understand how team collaboration, branch policies, and pipeline checks fit together

## Repository Structure

This repository should follow a practical DevOps layout:

- `terraform/` - infrastructure code
- `terraform/modules/` - reusable Terraform modules
- `terraform/environments/dev/` - development environment configuration
- `terraform/environments/stage/` - staging environment configuration
- `terraform/environments/prod/` - production environment configuration
- `.github/workflows/` - GitHub Actions examples and experiments
- `azure-pipelines/` - Azure DevOps YAML pipeline files
- `docs/` - notes, diagrams, and learning material
- `scripts/` - automation and helper scripts

## Working Approach

The learning process should be practical and incremental:

1. create or update a repository structure
2. work on a feature branch
3. make small, meaningful commits
4. push changes and open a pull request
5. validate changes through CI/CD
6. practice Terraform workflows through pipelines

## Workflow to Practice

- create a feature branch from `main`
- commit changes in small steps
- push the branch to the remote repository
- open a pull request
- review pipeline results
- merge after approval and validation

## Security Practices

- do not commit passwords, tokens, API keys, certificates, or `.env` files
- do not commit Terraform state files
- store secrets in GitHub secrets or Azure DevOps secret variables
- use scanning and validation tools where available

## End Goal

The final goal is to use Git as the central workflow tool connecting Terraform, Azure DevOps, collaboration, and deployment automation.

This lab should support production-ready habits, not just command memorization.