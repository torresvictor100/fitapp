# fitapp

## Requirements

To run this project, you need Docker Compose version 3 or higher.

## Getting Started

1. Clone this repository using the following command:

   ```bash
   git clone https://github.com/torresvictor100/fitapp.git
   ```

2. Navigate into the project directory:

   ```bash
   cd fitapp
   ```

3. Start the project using Docker Compose:

   ```bash
   docker compose up --build
   ```

   This command will build the Docker images and start the containers. You will see the logs in your terminal.

### Updating the Project

If you need to make changes to the project and want to rebuild the application, you can simply run:

```bash
docker compose restart app
```

### Stopping the Project

To stop and remove the containers, you can use the following command:

```bash
docker compose down
```

---