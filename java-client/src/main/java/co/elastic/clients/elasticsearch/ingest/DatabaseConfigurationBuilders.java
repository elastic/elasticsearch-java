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

package co.elastic.clients.elasticsearch.ingest;

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
 * Builders for {@link DatabaseConfiguration} variants.
 */
public class DatabaseConfigurationBuilders {
	private DatabaseConfigurationBuilders() {
	}

	/**
	 * Creates a builder for the {@link Maxmind maxmind}
	 * {@code DatabaseConfiguration} variant.
	 */
	public static Maxmind.Builder maxmind() {
		return new Maxmind.Builder();
	}

	/**
	 * Creates a DatabaseConfiguration of the {@link Maxmind maxmind}
	 * {@code DatabaseConfiguration} variant.
	 */
	public static DatabaseConfiguration maxmind(Function<Maxmind.Builder, ObjectBuilder<Maxmind>> fn) {
		DatabaseConfiguration.Builder builder = new DatabaseConfiguration.Builder();
		builder.maxmind(fn.apply(new Maxmind.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Ipinfo ipinfo} {@code DatabaseConfiguration}
	 * variant.
	 */
	public static Ipinfo.Builder ipinfo() {
		return new Ipinfo.Builder();
	}

	/**
	 * Creates a DatabaseConfiguration of the {@link Ipinfo ipinfo}
	 * {@code DatabaseConfiguration} variant.
	 */
	public static DatabaseConfiguration ipinfo(Function<Ipinfo.Builder, ObjectBuilder<Ipinfo>> fn) {
		DatabaseConfiguration.Builder builder = new DatabaseConfiguration.Builder();
		builder.ipinfo(fn.apply(new Ipinfo.Builder()).build());
		return builder.build();
	}

}
