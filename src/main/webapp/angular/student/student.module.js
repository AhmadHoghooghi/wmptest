angular.module('wmptest.student',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/student/student.controllers.js'
    ,'/wmptest/angular/student/student.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/student/list', {templateUrl: '/wmptest/angular/student/student.list.html', controller: 'StudentListCtrl'})
      .when('/wmptest/student/edit', {templateUrl: '/wmptest/angular/student/student.edit.html', controller: 'StudentEditCtrl'})
      .when('/wmptest/student/edit/:id', {templateUrl: '/wmptest/angular/student/student.edit.html', controller: 'StudentEditCtrl'})
      .when('/wmptest/student/display/:id', {templateUrl: '/wmptest/angular/student/student.display.html', controller: 'StudentDisplayCtrl'})
      	
  }]);
