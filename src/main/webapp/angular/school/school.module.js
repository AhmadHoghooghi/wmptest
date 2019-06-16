angular.module('wmptest.school',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/school/school.controllers.js'
    ,'/wmptest/angular/school/school.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/school/list', {templateUrl: '/wmptest/angular/school/school.list.html', controller: 'SchoolListCtrl'})
      .when('/wmptest/school/edit', {templateUrl: '/wmptest/angular/school/school.edit.html', controller: 'SchoolEditCtrl'})
      .when('/wmptest/school/edit/:id', {templateUrl: '/wmptest/angular/school/school.edit.html', controller: 'SchoolEditCtrl'})
      .when('/wmptest/school/display/:id', {templateUrl: '/wmptest/angular/school/school.display.html', controller: 'SchoolDisplayCtrl'})
      	
  }]);
