angular.module('wmptest.blogpost')
    .controller('BlogpostEditCtrl', ['$scope', 'BlogpostResource', 'wmptestControllerService', function ($scope, BlogpostResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'blogPost', BlogpostResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('BlogpostListCtrl', ['$scope', 'BlogpostResource', 'wmptestControllerService', function ($scope, BlogpostResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'blogPost', BlogpostResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('BlogpostDisplayCtrl', ['$scope', '$location', '$routeParams', 'BlogpostResource', 'wmptestControllerService', function ($scope, $location, $routeParams, BlogpostResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'blogPost', BlogpostResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
