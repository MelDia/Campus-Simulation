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

        <title> Campus simulacion </title>

        <style>
            body {
                background: linear-gradient(to top right, #0d6efd, #508bfc);
                height: 100vh;
            }

            #pass {
                margin-top: 105px;
                max-width: 410px;
                height: 380px;
                border: 2px solid #0d6efd;
                border-radius: 20px;
                background-color: white;
            }

            form {
                background-color: white;
            }

            h3 {
                font-weight: bold;
                color: #0d6efd
            }


        </style>
    </head>
    <body>
        <div id="pass" class="container d-flex align-items-center justify-content-center">
            <div id="login-row" class="row justify-content-center">
                <div>

                    <div class="title text-center mb-3">
                        <h3> Reset password </h3> 
                        <p class="text-black-50 mb-3">Please enter your email of registracion!</p>
                    </div>

                    <div>
                        <form action="${pageContext.request.contextPath}/resetPassword" method="POST">
                            <div class="form-outline mb-4">
                                <input type="email" name = "email" class="form-control" placeholder="Enter email"/>
                                <label class="form-label" for="email_address"></label>
                            </div>
                            
                            
                            <div class="d-grid gap-2 col-6 mx-auto mb-3">
                                <button type = "submit" value = "Get your password" class="btn btn-primary btn-block">
                                    Get your password!
                                </button>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
        </div>

    </body>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"></script>
</html>
