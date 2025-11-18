<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC Example</title>
    <style>
        body {
            font-family: "Segoe UI", Arial, sans-serif;
            background: linear-gradient(135deg, #74ebd5, #ACB6E5);
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            margin-top: 80px;
            font-size: 32px;
            letter-spacing: 1px;
        }

        .button-container {
            display: flex;
            justify-content: center;
            margin-top: 50px;
            gap: 20px;
        }

        form {
            display: inline-block;
        }

        button {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 14px 28px;
            text-align: center;
            font-size: 16px;
            border-radius: 8px;
            cursor: pointer;
            transition: 0.3s;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        }

        button:hover {
            background-color: #45a049;
            transform: translateY(-2px);
        }

        footer {
            margin-top: 80px;
            color: #444;
            font-size: 14px;
        }
    </style>
</head>
<body>

    <h1> Welcome to My Spring Boot MVC Home Page </h1>

    <div class="button-container">
        <form action="/save" method="post">
            <button type="submit">Go to User Page</button>
        </form>

        <form action="/emp" method="post">
            <button type="submit" style="background-color:#007BFF;">Go to Employee Page</button>
        </form>
    </div>

    <footer>Created with 💚 using Spring Boot MVC</footer>

</body>
</html>
