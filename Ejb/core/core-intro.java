													Types of Enterprise Java Bean
													===============================
																	|
																	|	
	+-----------------------------------------------------------------------------------------------------------------------------------+
	|																|																	|
	|																|																	|
Session Bean 												Message Driven Bean 													Entity Bean
	|
	|
	|
	|>1) Stateless Session Bean
	|				|
	|				|>@Stateless
	|				|>@PostConstruct
	|				|>@PreDestroy
	|
	|>2) Stateful Session Bean
	|				|
					|>@Stateful
					|>@PostConstruct
					|>@PreDestroy
					|>@PrePassivate
					|>@PostActivate
	|													
	|>3) Singleton Session Bean
	|
	