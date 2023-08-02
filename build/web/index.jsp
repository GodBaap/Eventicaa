<%-- 
    Document   : index
    Created on : 27 Feb, 2023, 1:44:37 PM
    Author     : Arpan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">

        <title>Eventicaa</title>
        
        <!-- CSS Files -->
        <link rel="stylesheet" type="text/css" href="css/homePage.css">
        <link rel="stylesheet" type="text/css" href="css/contactUs.css">
        <link rel="stylesheet" type="text/css" href="css/loginForm.css">
        <link rel="stylesheet" type="text/css" href="css/animatedBG.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        
    </head>
    <body>

        <!-- Animated Background -->
        <div class="d-flex flex-column justify-content-center w-100 h-100">
            <div class="d-flex flex-column justify-content-center align-items-center"></div>
        </div>

        <!--Header Area-->
        <header class="header-area header-sticky">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav class="main-nav">
                            <a href="#" class="logo">Eventicaa!</a>
                            <ul class="nav">
                                <li><a href="#" class="active">Home</a></li>
                                <li><a href="categories.html">Categories</a></li>
                                <li><a href="#services">Services</a></li>
                                <li><a href="aboutUs.html">About Us</a></li>
                                <li><a href="contactUs.html">Contact Us</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        
        <!-- Welcome -->
        <div class="welcome-area" id="welcome">
        <div class="header-text">
            <div class="container">
                <div class="row">
                    <div class="left-text col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <h1>The Stress Savers <strong>for YOU</strong></h1>
                        <p>Management of events & functions is a hectic process, right from business conferences and parties to family functions. Especially weddings are significant events for people and couples are often willing to spend a considerable amount of money to ensure that their weddings are well-organized.</p>
                    </div>
                    
                    <!-- Login -->
                    <div class="wrapper">
                     <div class="inner-warpper text-center">
                         <h2 class="title">Login to your account</h2>
                            <form method="post" action="userLogin" id="formvalidate">
                            <div class="input-group">
                            <label class="palceholder" for="userName">User Name</label>
                            <input class="form-control" name="username" id="userName" type="text" placeholder="" />
                            <span class="lighting"></span>
                            </div>
                            <div class="input-group">
                            <label class="palceholder" for="userPassword">Password</label>
                            <input class="form-control" name="password" id="userPassword" type="password" placeholder="" />
                            <span class="lighting"></span>
                            </div>
                            <button type="submit" id="login">Login</button>
                            <div class="clearfix supporter">
                           <!-- <div class="pull-left remember-me">
                                <input id="rememberMe" type="checkbox">
                                <label for="rememberMe">Remember Me</label>
                            </div> -->
                            <a class="forgot pull-right" href="#">Forgot Password?</a>
                        </div>
                        </form>
                        </div>
                        <div class="signup-wrapper text-center">
                        <a href="userRegister.html">Don't have an account? <span class="text-primary">Create One</span></a>
                        </div>
                        </div>
                </div>
            </div>
        </div>
        </div>
        
        <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.0/jquery.validate.min.js'></script>
        <script  src="js/loginForm.js"></script>

    </body>
</html>

