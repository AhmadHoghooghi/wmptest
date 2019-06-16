angular.module('wmptest.tag')
    .controller('TagEditCtrl', ['$scope', 'TagResource', 'wmptestControllerService', function ($scope, TagResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'tag', TagResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('TagListCtrl', ['$scope', 'TagResource', 'wmptestControllerService', function ($scope, TagResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'tag', TagResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('TagDisplayCtrl', ['$scope', '$location', '$routeParams', 'TagResource', 'wmptestControllerService', function ($scope, $location, $routeParams, TagResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'tag', TagResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
