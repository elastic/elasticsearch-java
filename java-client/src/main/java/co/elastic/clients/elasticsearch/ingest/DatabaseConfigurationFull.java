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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: ingest._types.DatabaseConfigurationFull

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.DatabaseConfigurationFull">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatabaseConfigurationFull extends DatabaseConfiguration {
	@Nullable
	private final Web web;

	@Nullable
	private final Local local;

	// ---------------------------------------------------------------------------------------------

	private DatabaseConfigurationFull(Builder builder) {
		super(builder);

		this.web = builder.web;
		this.local = builder.local;

	}

	public static DatabaseConfigurationFull of(Function<Builder, ObjectBuilder<DatabaseConfigurationFull>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code web}
	 */
	@Nullable
	public final Web web() {
		return this.web;
	}

	/**
	 * API name: {@code local}
	 */
	@Nullable
	public final Local local() {
		return this.local;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.web != null) {
			generator.writeKey("web");
			this.web.serialize(generator, mapper);

		}
		if (this.local != null) {
			generator.writeKey("local");
			this.local.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatabaseConfigurationFull}.
	 */

	public static class Builder extends DatabaseConfiguration.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DatabaseConfigurationFull> {
		@Nullable
		private Web web;

		@Nullable
		private Local local;

		/**
		 * API name: {@code web}
		 */
		public final Builder web(@Nullable Web value) {
			this.web = value;
			return this;
		}

		/**
		 * API name: {@code web}
		 */
		public final Builder web(Function<Web.Builder, ObjectBuilder<Web>> fn) {
			return this.web(fn.apply(new Web.Builder()).build());
		}

		/**
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Local value) {
			this.local = value;
			return this;
		}

		/**
		 * API name: {@code local}
		 */
		public final Builder local(Function<Local.Builder, ObjectBuilder<Local>> fn) {
			return this.local(fn.apply(new Local.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatabaseConfigurationFull}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatabaseConfigurationFull build() {
			_checkSingleUse();

			return new DatabaseConfigurationFull(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatabaseConfigurationFull}
	 */
	public static final JsonpDeserializer<DatabaseConfigurationFull> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatabaseConfigurationFull::setupDatabaseConfigurationFullDeserializer);

	protected static void setupDatabaseConfigurationFullDeserializer(
			ObjectDeserializer<DatabaseConfigurationFull.Builder> op) {
		DatabaseConfiguration.setupDatabaseConfigurationDeserializer(op);
		op.add(Builder::web, Web._DESERIALIZER, "web");
		op.add(Builder::local, Local._DESERIALIZER, "local");

	}

}
