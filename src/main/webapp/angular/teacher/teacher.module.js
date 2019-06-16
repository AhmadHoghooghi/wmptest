angular.module('wmptest.teacher',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/teacher/teacher.controllers.js'
    ,'/wmptest/angular/teacher/teacher.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/teacher/list', {templateUrl: '/wmptest/angular/teacher/teacher.list.html', controller: 'TeacherListCtrl'})
      .when('/wmptest/teacher/edit', {templateUrl: '/wmptest/angular/teacher/teacher.edit.html', controller: 'TeacherEditCtrl'})
      .when('/wmptest/teacher/edit/:id', {templateUrl: '/wmptest/angular/teacher/teacher.edit.html', controller: 'TeacherEditCtrl'})
      .when('/wmptest/teacher/display/:id', {templateUrl: '/wmptest/angular/teacher/teacher.display.html', controller: 'TeacherDisplayCtrl'})
      	
  }]);
