angular.module('wmptest.school')
    .controller('SchoolEditCtrl', ['$scope', 'SchoolResource', 'wmptestControllerService', function ($scope, SchoolResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'school', SchoolResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('SchoolListCtrl', ['$scope', 'SchoolResource', 'wmptestControllerService', function ($scope, SchoolResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'school', SchoolResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('SchoolDisplayCtrl', ['$scope', '$location', '$routeParams', 'SchoolResource', 'wmptestControllerService', function ($scope, $location, $routeParams, SchoolResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'school', SchoolResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
