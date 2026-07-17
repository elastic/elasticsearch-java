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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.json.JsonData;
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

// typedef: esql._types.ESQLDataSource

/**
 * Represents a data source definition stored in cluster state. A data source
 * holds connection settings (credentials, endpoints, auth) for an external data
 * provider.
 * 
 * @see <a href="../doc-files/api-spec.html#esql._types.ESQLDataSource">API
 *      specification</a>
 */
@JsonpDeserializable
public class ESQLDataSource implements JsonpSerializable {
	private final String name;

	private final String type;

	@Nullable
	private final String description;

	private final Map<String, JsonData> settings;

	// ---------------------------------------------------------------------------------------------

	private ESQLDataSource(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.description = builder.description;
		this.settings = ApiTypeHelper.unmodifiableRequired(builder.settings, this, "settings");

	}

	public static ESQLDataSource of(Function<Builder, ObjectBuilder<ESQLDataSource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The data source name.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The data source type.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * A free-text description.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - Type-specific settings.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("type");
		generator.write(this.type);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
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
	 * Builder for {@link ESQLDataSource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ESQLDataSource> {
		private String name;

		private String type;

		@Nullable
		private String description;

		private Map<String, JsonData> settings;

		public Builder() {
		}
		private Builder(ESQLDataSource instance) {
			this.name = instance.name;
			this.type = instance.type;
			this.description = instance.description;
			this.settings = instance.settings;

		}
		/**
		 * Required - The data source name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The data source type.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * A free-text description.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - Type-specific settings.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Required - Type-specific settings.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ESQLDataSource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ESQLDataSource build() {
			_checkSingleUse();

			return new ESQLDataSource(this);
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
	 * Json deserializer for {@link ESQLDataSource}
	 */
	public static final JsonpDeserializer<ESQLDataSource> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ESQLDataSource::setupESQLDataSourceDeserializer);

	protected static void setupESQLDataSourceDeserializer(ObjectDeserializer<ESQLDataSource.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

}
