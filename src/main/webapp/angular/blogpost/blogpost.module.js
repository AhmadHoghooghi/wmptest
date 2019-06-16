angular.module('wmptest.blogpost',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/blogpost/blogpost.controllers.js'
    ,'/wmptest/angular/blogpost/blogpost.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/blogpost/list', {templateUrl: '/wmptest/angular/blogpost/blogpost.list.html', controller: 'BlogpostListCtrl'})
      .when('/wmptest/blogpost/edit', {templateUrl: '/wmptest/angular/blogpost/blogpost.edit.html', controller: 'BlogpostEditCtrl'})
      .when('/wmptest/blogpost/edit/:id', {templateUrl: '/wmptest/angular/blogpost/blogpost.edit.html', controller: 'BlogpostEditCtrl'})
      .when('/wmptest/blogpost/display/:id', {templateUrl: '/wmptest/angular/blogpost/blogpost.display.html', controller: 'BlogpostDisplayCtrl'})
      	
  }]);
