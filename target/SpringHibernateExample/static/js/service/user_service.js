/* global self */

'use strict';

App.factory('UserService', ['$http', '$q', function($http, $q){

	return {
		
			fetchAllUsers: function() {
					return $http.get('http://localhost:8080/com.iconsultus.proj_AirlineReservation_REST_AngularJS/user/')
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching users');
										return $q.reject(errResponse);
									}
							);
			},
		    
		    createUser: function(user){
                        console.log('UserService creating New User with name:'+user.name);  
               
					return $http.post('http://localhost:8080/com.iconsultus.proj_AirlineReservation_REST_AngularJS/user/', user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while creating user');
										return $q.reject(errResponse);
									}
							);
		    },
		    
		    updateUser: function(user, id){
					return $http.put('http://localhost:8080/com.iconsultus.proj_AirlineReservation_REST_AngularJS/user/'+id, user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while updating user');
										return $q.reject(errResponse);
									}
							);
			},
                        find_flight: function(source){
                            console.log('In user_service find_flight routine trying to call server fligt/'+source);
					return $http.get('http://localhost:8080/com.iconsultus.proj_AirlineReservation_REST_AngularJS/flight/'+source)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while finding service user');
										return $q.reject(errResponse);
									}
							);
			},
		    
			deleteUser: function(id){
					return $http.delete('http://localhost:8080/com.iconsultus.proj_AirlineReservation_REST_AngularJS/user/'+id)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while deleting user');
										return $q.reject(errResponse);
									}
							);
			}
		
	};

}]);
