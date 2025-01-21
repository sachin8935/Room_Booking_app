# Room Booking App

Room Booking App is a comprehensive solution for managing guest house operations, including bookings, payments, room availability, and expense tracking. Built with **React Native**, **TypeScript**, **Spring Boot**, and **MySQL**, the app streamlines the management process with an intuitive interface and robust backend support.

---

## Features

### Dashboard

1. **Overview of Arrivals and Departures**:
   - Displays today's arrivals, departures, and dues to be collected.
2. **Room Availability**:
   - Visual representation of room availability in a grid format.

### Bookings

- Add new bookings.
- Manage payments for each booking.
- Update or delete existing bookings.
- Modify payments associated with bookings.

### Customers / Rooms / Expenses / Room Costs

- Perform Create, Read, Update, and Delete (CRUD) operations for:
  - Customers
  - Rooms
  - Expenses
  - Room costs

### Customer Requirements

Bookings can be customized based on specific customer needs:

- **Room Size Types**: Single, Double, Triple, Queen, Single (small)
- **Bathroom Type**: Attached or Common
- **Booking Type**: Monthly or Daily

---

## Technologies Used

- **Backend**:
  - Spring Boot: For handling REST APIs and backend logic.
  - Java: Core language for the backend.
  - MySQL: Database for storing bookings, payments, and customer data.
  - Gradle: Build tool for managing dependencies.

- **Frontend**:
  - React Native: For building the user interface.
  - TypeScript: Ensures type safety and scalability.
  - CSS: For styling components.

---

## Installation & Setup

Follow these steps to run the Room Booking App locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/sachin8935/Room_Booking_app.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Room_Booking_app
   ```

3. Install dependencies for the frontend:
   ```bash
   npm install
   ```

4. Set up the backend:
   - Ensure MySQL is installed and running.
   - Configure the database credentials in the Spring Boot application.

5. Start the backend server:
   ```bash
   ./gradlew bootRun
   ```

6. Start the frontend server:
   ```bash
   npm start
   ```

7. Open your browser and visit:
   [http://localhost:3000](http://localhost:3000)

---

## Usage

1. View today's arrivals, departures, and room availability on the **Dashboard**.
2. Add or update bookings and payments under the **Bookings** section.
3. Manage customers, rooms, and expenses through their respective modules.
4. Customize bookings based on customer requirements.

---

## Contribution

Contributions are welcome! Follow these steps to contribute:

1. Fork the repository.
2. Create a new branch for your feature/bugfix.
3. Commit your changes and push them to your branch.
4. Open a pull request to the main repository.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

## Author

**Sachin Kumar**

- [LinkedIn](https://www.linkedin.com/in/startwithsachin)
- [GitHub](https://github.com/sachin8935)

---

## Acknowledgments

- Gratitude to the open-source community for their support and inspiration.

Thank You