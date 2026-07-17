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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: xpack.usage.QueryLoggingConfig

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.QueryLoggingConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryLoggingConfig implements JsonpSerializable {
	private final boolean enabled;

	private final boolean user;

	private final boolean system;

	@Nullable
	private final Time threshold;

	// ---------------------------------------------------------------------------------------------

	private QueryLoggingConfig(Builder builder) {

		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled", false);
		this.user = ApiTypeHelper.requireNonNull(builder.user, this, "user", false);
		this.system = ApiTypeHelper.requireNonNull(builder.system, this, "system", false);
		this.threshold = builder.threshold;

	}

	public static QueryLoggingConfig of(Function<Builder, ObjectBuilder<QueryLoggingConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether query logging is enabled.
	 * <p>
	 * API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - Whether user information is included in the query log.
	 * <p>
	 * API name: {@code user}
	 */
	public final boolean user() {
		return this.user;
	}

	/**
	 * Required - Whether system queries are included in the query log.
	 * <p>
	 * API name: {@code system}
	 */
	public final boolean system() {
		return this.system;
	}

	/**
	 * The configured logging threshold, if any.
	 * <p>
	 * API name: {@code threshold}
	 */
	@Nullable
	public final Time threshold() {
		return this.threshold;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("user");
		generator.write(this.user);

		generator.writeKey("system");
		generator.write(this.system);

		if (this.threshold != null) {
			generator.writeKey("threshold");
			this.threshold.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryLoggingConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QueryLoggingConfig> {
		private Boolean enabled;

		private Boolean user;

		private Boolean system;

		@Nullable
		private Time threshold;

		public Builder() {
		}
		private Builder(QueryLoggingConfig instance) {
			this.enabled = instance.enabled;
			this.user = instance.user;
			this.system = instance.system;
			this.threshold = instance.threshold;

		}
		/**
		 * Required - Whether query logging is enabled.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - Whether user information is included in the query log.
		 * <p>
		 * API name: {@code user}
		 */
		public final Builder user(boolean value) {
			this.user = value;
			return this;
		}

		/**
		 * Required - Whether system queries are included in the query log.
		 * <p>
		 * API name: {@code system}
		 */
		public final Builder system(boolean value) {
			this.system = value;
			return this;
		}

		/**
		 * The configured logging threshold, if any.
		 * <p>
		 * API name: {@code threshold}
		 */
		public final Builder threshold(@Nullable Time value) {
			this.threshold = value;
			return this;
		}

		/**
		 * The configured logging threshold, if any.
		 * <p>
		 * API name: {@code threshold}
		 */
		public final Builder threshold(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.threshold(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryLoggingConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryLoggingConfig build() {
			_checkSingleUse();

			return new QueryLoggingConfig(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryLoggingConfig}
	 */
	public static final JsonpDeserializer<QueryLoggingConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryLoggingConfig::setupQueryLoggingConfigDeserializer);

	protected static void setupQueryLoggingConfigDeserializer(ObjectDeserializer<QueryLoggingConfig.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::user, JsonpDeserializer.booleanDeserializer(), "user");
		op.add(Builder::system, JsonpDeserializer.booleanDeserializer(), "system");
		op.add(Builder::threshold, Time._DESERIALIZER, "threshold");

	}

}
