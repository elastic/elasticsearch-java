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
import java.lang.String;
import java.util.Map;
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

// typedef: xpack.usage.EsqlLoggingConfig

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.EsqlLoggingConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class EsqlLoggingConfig implements JsonpSerializable {
	private final boolean enabled;

	private final boolean user;

	private final Map<String, Time> thresholds;

	// ---------------------------------------------------------------------------------------------

	private EsqlLoggingConfig(Builder builder) {

		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled", false);
		this.user = ApiTypeHelper.requireNonNull(builder.user, this, "user", false);
		this.thresholds = ApiTypeHelper.unmodifiable(builder.thresholds);

	}

	public static EsqlLoggingConfig of(Function<Builder, ObjectBuilder<EsqlLoggingConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether ES|QL query logging is enabled.
	 * <p>
	 * API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - Whether user information is included in the ES|QL query log.
	 * <p>
	 * API name: {@code user}
	 */
	public final boolean user() {
		return this.user;
	}

	/**
	 * The configured logging thresholds, keyed by threshold name, if any.
	 * <p>
	 * API name: {@code thresholds}
	 */
	public final Map<String, Time> thresholds() {
		return this.thresholds;
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

		if (ApiTypeHelper.isDefined(this.thresholds)) {
			generator.writeKey("thresholds");
			generator.writeStartObject();
			for (Map.Entry<String, Time> item0 : this.thresholds.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EsqlLoggingConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EsqlLoggingConfig> {
		private Boolean enabled;

		private Boolean user;

		@Nullable
		private Map<String, Time> thresholds;

		public Builder() {
		}
		private Builder(EsqlLoggingConfig instance) {
			this.enabled = instance.enabled;
			this.user = instance.user;
			this.thresholds = instance.thresholds;

		}
		/**
		 * Required - Whether ES|QL query logging is enabled.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - Whether user information is included in the ES|QL query log.
		 * <p>
		 * API name: {@code user}
		 */
		public final Builder user(boolean value) {
			this.user = value;
			return this;
		}

		/**
		 * The configured logging thresholds, keyed by threshold name, if any.
		 * <p>
		 * API name: {@code thresholds}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>thresholds</code>.
		 */
		public final Builder thresholds(Map<String, Time> map) {
			this.thresholds = _mapPutAll(this.thresholds, map);
			return this;
		}

		/**
		 * The configured logging thresholds, keyed by threshold name, if any.
		 * <p>
		 * API name: {@code thresholds}
		 * <p>
		 * Adds an entry to <code>thresholds</code>.
		 */
		public final Builder thresholds(String key, Time value) {
			this.thresholds = _mapPut(this.thresholds, key, value);
			return this;
		}

		/**
		 * The configured logging thresholds, keyed by threshold name, if any.
		 * <p>
		 * API name: {@code thresholds}
		 * <p>
		 * Adds an entry to <code>thresholds</code> using a builder lambda.
		 */
		public final Builder thresholds(String key, Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return thresholds(key, fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EsqlLoggingConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EsqlLoggingConfig build() {
			_checkSingleUse();

			return new EsqlLoggingConfig(this);
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
	 * Json deserializer for {@link EsqlLoggingConfig}
	 */
	public static final JsonpDeserializer<EsqlLoggingConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EsqlLoggingConfig::setupEsqlLoggingConfigDeserializer);

	protected static void setupEsqlLoggingConfigDeserializer(ObjectDeserializer<EsqlLoggingConfig.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::user, JsonpDeserializer.booleanDeserializer(), "user");
		op.add(Builder::thresholds, JsonpDeserializer.stringMapDeserializer(Time._DESERIALIZER), "thresholds");

	}

}
