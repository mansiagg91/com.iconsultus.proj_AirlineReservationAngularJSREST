<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html ng-app="App">
  <head>  
    <title>AngularJS based Airline Reservation System ys==using Hibernate MVC on server side</title>  
    <style>
      .source.ng-valid {
          background-color: lightgreen;
      }
      .source.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .source.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

       .destination.ng-valid {
          background-color: lightgreen;
      }
      .desination.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .destination.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }



    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
  <body  class="ng-cloak">
      <div class="generic-container" ng-controller="UserController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">User Registration Form </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.find()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.user.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">SOURCE</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.flight1.src" name="uname" class="name form-control input-sm" placeholder="Enter source" required ng-minlength="3"/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                      <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                      <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                        
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">DESTINATION</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.flight1.dest" name="destination" class="form-control input-sm" placeholder="Enter destination[This field is validation free]"/>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Destination</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.flight1.DayTimeDept" name="DATE" class="email form-control input-sm" placeholder="Enter Date" required/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <!---span ng-show="myForm.email.$error.required">This is a required field</span>
                                      <span ng-show="myForm.email.$invalid">This field is invalid </span-->
                                  </div>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Users </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>ID</th>
                              <th>Name</th>
                              <th>Source</th>
                              <th>Destination</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <!--tr ng-repeat="u in ctrl.users">
                              <td><span ng-bind="u.id"></span></td>
                              <td><span ng-bind="u.name"></span></td>
                              <td><span ng-bind="u.source"></span></td>
                              <td><span ng-bind="u.destination"></span></td>
                              <td>
                              <button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Remove</button>
                              </td>
                          </tr-->
                          
                          <tr ng-repeat="u in ctrl.result">
                              <td><span ng-bind="u.id"></span></td>
                              <td><span ng-bind="u.DayTimeDep"></span></td>
                              <td><span ng-bind="u.src"></span></td>
                              <td><span ng-bind="u.dest"></span></td>
                              <td>
                              <button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Remove</button>
                              </td>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
      </div>
      
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/user_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/user_controller.js' />"></script>
  </body>
</html>