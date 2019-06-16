angular.module('wmptest.message',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/message/message.controllers.js'
    ,'/wmptest/angular/message/message.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/message/list', {templateUrl: '/wmptest/angular/message/message.list.html', controller: 'MessageListCtrl'})
      .when('/wmptest/message/edit', {templateUrl: '/wmptest/angular/message/message.edit.html', controller: 'MessageEditCtrl'})
      .when('/wmptest/message/edit/:id', {templateUrl: '/wmptest/angular/message/message.edit.html', controller: 'MessageEditCtrl'})
      .when('/wmptest/message/display/:id', {templateUrl: '/wmptest/angular/message/message.display.html', controller: 'MessageDisplayCtrl'})
      	
  }]);
