angular.module('wmptest.employee',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/employee/employee.controllers.js'
    ,'/wmptest/angular/employee/employee.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/employee/list', {templateUrl: '/wmptest/angular/employee/employee.list.html', controller: 'EmployeeListCtrl'})
      .when('/wmptest/employee/edit', {templateUrl: '/wmptest/angular/employee/employee.edit.html', controller: 'EmployeeEditCtrl'})
      .when('/wmptest/employee/edit/:id', {templateUrl: '/wmptest/angular/employee/employee.edit.html', controller: 'EmployeeEditCtrl'})
      .when('/wmptest/employee/display/:id', {templateUrl: '/wmptest/angular/employee/employee.display.html', controller: 'EmployeeDisplayCtrl'})
      	
  }]);
