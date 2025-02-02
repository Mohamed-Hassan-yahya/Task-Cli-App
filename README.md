# Task Cli App
The Task Tracker CLI is a simple command-line tool to manage tasks, allowing users to add, update, delete, and track task progress. It stores tasks in a JSON file and supports listing tasks by status (done, in progress, or pending).
- Solution to the backend project from [roadmap.sh](https://roadmap.sh/projects/task-tracker).

## Features

- **Add Tasks:** Create tasks with a short description.
- **Update Tasks:** Modify existing tasks.
- **Delete Tasks:** Remove tasks that are no longer needed.
- **Mark Tasks:** Set tasks as `In Progress` or `Done`.
- **List Tasks:** View all tasks or filter by status (`todo`, `in-progress`, `done`).
- **Persistent Storage:** Tasks are stored in a JSON file so that they persist across sessions.

## Getting Started

### 1. Clone the repository

First, clone the repository to your local machine:

```bash
git clone [https://github.com/your-username/tasky-cli.git](https://github.com/Mohamed-Hassan-yahya/CLI-App.git)
cd CLI-App
```

### 2. Compile the application

```bash
javac -cp "lib/*" src/main/java/*.java
```

### 3. Run the application

```bash
./task-cli <command> [args...]
```

## Usage Example

```bash
# Adding a new task
./task-cli add "Buy groceries"
# Output: Task added successfully (ID: 1)

# Updating and deleting tasks
./task-cli update 1 "Buy groceries and cook dinner"
./task-cli delete 1

# Marking a task as in progress or done
./task-cli mark-in-progress 1
./task-cli mark-done 1

# Listing all tasks
./task-cli list

# Listing tasks by status
./task-cli list done
./task-cli list todo
./task-cli list in-progress
```
