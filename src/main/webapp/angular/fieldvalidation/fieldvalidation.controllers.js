angular.module('wmptest.fieldvalidation')
    .controller('FieldvalidationEditCtrl', ['$scope', 'FieldvalidationResource', 'wmptestControllerService', function ($scope, FieldvalidationResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'fieldValidation', FieldvalidationResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('FieldvalidationListCtrl', ['$scope', 'FieldvalidationResource', 'wmptestControllerService', function ($scope, FieldvalidationResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'fieldValidation', FieldvalidationResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('FieldvalidationDisplayCtrl', ['$scope', '$location', '$routeParams', 'FieldvalidationResource', 'wmptestControllerService', function ($scope, $location, $routeParams, FieldvalidationResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'fieldValidation', FieldvalidationResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
