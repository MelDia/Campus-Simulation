<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9bc29573df.js" crossorigin="anonymous"></script>

        <style>
            body {
                background: linear-gradient(to top right, #0d6efd, #508bfc);
                height: 110vh;
            }

            #register {
                margin-top: 30px;
                max-width: 480px;
                height: 600px;
                border: 2px solid #0d6efd;
                border-radius: 30px;
                background-color: white;
            }

            h3 {
                font-weight: bold;
                color: #0d6efd
            }
        </style>

        <title>Campus simulation</title>

    </head>
    <body>
        <div id="register" class="container d-flex align-items-center justify-content-center">
            <div id="login-row">
                <div class="title text-center mb-3">
                    <h3>User register</h3>
                </div>

                <form action="${pageContext.request.contextPath}/registServlet" method="POST" class="was-validated" >
                    <div class="row mb-4">
                        <div class="col">
                            <div class="form-outline">
                                <input type="text" name = "name" class="form-control" required/>
                                <label class="form-label" for="form3Example1">First name</label>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form-outline">
                                <input type="text" name = "lastname" class="form-control" required/>
                                <label class="form-label" for="form3Example2">Last name</label>
                            </div>
                        </div>
                    </div>
                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <input type="email" name = "email" class="form-control" required/>
                        <label class="form-label" for="form3Example3">Email address</label>
                    </div>

                    <!-- Username input -->
                    <div class="form-outline mb-4">
                        <input type="text" name = "username" class="form-control" required/>
                        <label class="form-label" for="form3Example4">Username</label>
                    </div>

                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <input type="password" name = "password" class="form-control" required/>
                        <label class="form-label" for="form3Example4">Password</label>
                    </div>    

                    <!-- Submit button -->
                    <div class="d-grid gap-2 col-6 mx-auto mb-3">
                        <button type = "submit" value = "Registro" class="btn btn-primary btn-block">
                            Sign up
                        </button>
                    </div>

                </form>
            </div>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
                integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
                integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
        

    </body>
</html>