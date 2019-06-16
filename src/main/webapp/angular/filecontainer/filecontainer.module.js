angular.module('wmptest.filecontainer',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/filecontainer/filecontainer.controllers.js'
    ,'/wmptest/angular/filecontainer/filecontainer.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/filecontainer/list', {templateUrl: '/wmptest/angular/filecontainer/filecontainer.list.html', controller: 'FilecontainerListCtrl'})
      .when('/wmptest/filecontainer/edit', {templateUrl: '/wmptest/angular/filecontainer/filecontainer.edit.html', controller: 'FilecontainerEditCtrl'})
      .when('/wmptest/filecontainer/edit/:id', {templateUrl: '/wmptest/angular/filecontainer/filecontainer.edit.html', controller: 'FilecontainerEditCtrl'})
      .when('/wmptest/filecontainer/display/:id', {templateUrl: '/wmptest/angular/filecontainer/filecontainer.display.html', controller: 'FilecontainerDisplayCtrl'})
      	
  }]);
