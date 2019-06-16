angular.module('wmptest.home')
    .controller('HomeEditCtrl', ['$scope', 'HomeResource', 'wmptestControllerService', function ($scope, HomeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'home', HomeResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('HomeListCtrl', ['$scope', 'HomeResource', 'wmptestControllerService', function ($scope, HomeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'home', HomeResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('HomeDisplayCtrl', ['$scope', '$location', '$routeParams', 'HomeResource', 'wmptestControllerService', function ($scope, $location, $routeParams, HomeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'home', HomeResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
		$scope.kitchenParams={
      hideSearchPanel: true,
      masterPK:$scope.id,
      'filter.eq:home.pk': $scope.id
    };
    }]);
