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
            
            
        </style>
    </head>
    <body>
        <div id="pass" class="container d-flex align-items-center justify-content-center">
            <div id="login-row" class="row justify-content-center">


                <div class="title text-center mb-3">
                    ResetPassword                            
                </div>

                <div>
                    <form action="${pageContext.request.contextPath}/resetPassword" method="POST">
                        <div class="form-group row">
                            <label for="email_address" class="col-md-4 col-form-label text-md-right">
                                Enter Email of registration
                            </label>
                            <div class="col-md-6">
                                <input type="text" id="email"  class="form-control" placeholder="Enter Login Id"
                                       name="email" />
                                <font  color="red"></font>
                            </div>
                        </div>
                        <div class="col-md-6 offset-md-4">
                            <input type="submit" class="btn btn-primary" value="Get your password"/>

                        </div>
                    </form>
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
