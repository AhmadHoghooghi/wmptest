angular.module('wmptest.task',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/task/task.controllers.js'
    ,'/wmptest/angular/task/task.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/task/list', {templateUrl: '/wmptest/angular/task/task.list.html', controller: 'TaskListCtrl'})
      .when('/wmptest/task/edit', {templateUrl: '/wmptest/angular/task/task.edit.html', controller: 'TaskEditCtrl'})
      .when('/wmptest/task/edit/:id', {templateUrl: '/wmptest/angular/task/task.edit.html', controller: 'TaskEditCtrl'})
      .when('/wmptest/task/display/:id', {templateUrl: '/wmptest/angular/task/task.display.html', controller: 'TaskDisplayCtrl'})
      	
  }]);
