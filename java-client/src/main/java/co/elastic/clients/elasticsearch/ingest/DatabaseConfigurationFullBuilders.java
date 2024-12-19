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
 * Builders for {@link DatabaseConfigurationFull} variants.
 */
public class DatabaseConfigurationFullBuilders {
	private DatabaseConfigurationFullBuilders() {
	}

	/**
	 * Creates a builder for the {@link Web web} {@code DatabaseConfigurationFull}
	 * variant.
	 */
	public static Web.Builder web() {
		return new Web.Builder();
	}

	/**
	 * Creates a DatabaseConfigurationFull of the {@link Web web}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static DatabaseConfigurationFull web(Function<Web.Builder, ObjectBuilder<Web>> fn) {
		DatabaseConfigurationFull.Builder builder = new DatabaseConfigurationFull.Builder();
		builder.web(fn.apply(new Web.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Local local}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static Local.Builder local() {
		return new Local.Builder();
	}

	/**
	 * Creates a DatabaseConfigurationFull of the {@link Local local}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static DatabaseConfigurationFull local(Function<Local.Builder, ObjectBuilder<Local>> fn) {
		DatabaseConfigurationFull.Builder builder = new DatabaseConfigurationFull.Builder();
		builder.local(fn.apply(new Local.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Maxmind maxmind}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static Maxmind.Builder maxmind() {
		return new Maxmind.Builder();
	}

	/**
	 * Creates a DatabaseConfigurationFull of the {@link Maxmind maxmind}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static DatabaseConfigurationFull maxmind(Function<Maxmind.Builder, ObjectBuilder<Maxmind>> fn) {
		DatabaseConfigurationFull.Builder builder = new DatabaseConfigurationFull.Builder();
		builder.maxmind(fn.apply(new Maxmind.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Ipinfo ipinfo}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static Ipinfo.Builder ipinfo() {
		return new Ipinfo.Builder();
	}

	/**
	 * Creates a DatabaseConfigurationFull of the {@link Ipinfo ipinfo}
	 * {@code DatabaseConfigurationFull} variant.
	 */
	public static DatabaseConfigurationFull ipinfo(Function<Ipinfo.Builder, ObjectBuilder<Ipinfo>> fn) {
		DatabaseConfigurationFull.Builder builder = new DatabaseConfigurationFull.Builder();
		builder.ipinfo(fn.apply(new Ipinfo.Builder()).build());
		return builder.build();
	}

}
