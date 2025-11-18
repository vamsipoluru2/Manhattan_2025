<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>
    <h1>Register Student</h1>
    <form action="/save" method="post">
        <label>ID:</label><br>
        <input type="number" name="id" required><br><br>

        <label>Name:</label><br>
        <input type="text" name="name" required><br><br>

        <label>Fees:</label><br>
        <input type="number" name="fees" step="0.01" required><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
