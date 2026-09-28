/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.security.get_service_accounts;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link ServiceAccountInfo} variants.
 */
public class ServiceAccountInfoBuilders {
	private ServiceAccountInfoBuilders() {
	}

	/**
	 * Creates a builder for the {@link BuiltInServiceAccount built_in}
	 * {@code ServiceAccountInfo} variant.
	 */
	public static BuiltInServiceAccount.Builder builtIn() {
		return new BuiltInServiceAccount.Builder();
	}

	/**
	 * Creates a ServiceAccountInfo of the {@link BuiltInServiceAccount built_in}
	 * {@code ServiceAccountInfo} variant.
	 */
	public static ServiceAccountInfo builtIn(
			Function<BuiltInServiceAccount.Builder, ObjectBuilder<BuiltInServiceAccount>> fn) {
		ServiceAccountInfo.Builder builder = new ServiceAccountInfo.Builder();
		builder.builtIn(fn.apply(new BuiltInServiceAccount.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UserManagedServiceAccount user_managed}
	 * {@code ServiceAccountInfo} variant.
	 */
	public static UserManagedServiceAccount.Builder userManaged() {
		return new UserManagedServiceAccount.Builder();
	}

	/**
	 * Creates a ServiceAccountInfo of the {@link UserManagedServiceAccount
	 * user_managed} {@code ServiceAccountInfo} variant.
	 */
	public static ServiceAccountInfo userManaged(
			Function<UserManagedServiceAccount.Builder, ObjectBuilder<UserManagedServiceAccount>> fn) {
		ServiceAccountInfo.Builder builder = new ServiceAccountInfo.Builder();
		builder.userManaged(fn.apply(new UserManagedServiceAccount.Builder()).build());
		return builder.build();
	}

}
