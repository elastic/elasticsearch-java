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

// typedef: esql._types.ESQLDataset

/**
 * Represents a dataset definition stored in cluster state. A dataset is a named
 * reference to external data that participates in the index namespace alongside
 * indices, aliases, and views. Datasets inherit credentials from their
 * referenced data source at query time.
 * 
 * @see <a href="../doc-files/api-spec.html#esql._types.ESQLDataset">API
 *      specification</a>
 */
@JsonpDeserializable
public class ESQLDataset implements JsonpSerializable {
	private final String name;

	private final String dataSource;

	private final String resource;

	@Nullable
	private final String description;

	private final Map<String, JsonData> settings;

	@Nullable
	private final DatasetMapping mappings;

	// ---------------------------------------------------------------------------------------------

	private ESQLDataset(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.dataSource = ApiTypeHelper.requireNonNull(builder.dataSource, this, "dataSource");
		this.resource = ApiTypeHelper.requireNonNull(builder.resource, this, "resource");
		this.description = builder.description;
		this.settings = ApiTypeHelper.unmodifiable(builder.settings);
		this.mappings = builder.mappings;

	}

	public static ESQLDataset of(Function<Builder, ObjectBuilder<ESQLDataset>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The dataset name.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The name of the referenced data source.
	 * <p>
	 * API name: {@code data_source}
	 */
	public final String dataSource() {
		return this.dataSource;
	}

	/**
	 * Required - The URI that identifies the data to read, resolved against the
	 * referenced data source. It can include glob patterns, for example a recursive
	 * pattern that matches Parquet files under
	 * <code>s3://logs-bucket/access</code>.
	 * <p>
	 * API name: {@code resource}
	 */
	public final String resource() {
		return this.resource;
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
	 * Format- and parsing-specific settings that configure how the resource is
	 * read. Common keys include <code>format</code> and
	 * <code>partition_detection</code>. Additional keys depend on the format
	 * reader; compression can be inferred from the resource URI.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * The user-declared mapping on the dataset definition.
	 * <p>
	 * API name: {@code mappings}
	 */
	@Nullable
	public final DatasetMapping mappings() {
		return this.mappings;
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

		generator.writeKey("data_source");
		generator.write(this.dataSource);

		generator.writeKey("resource");
		generator.write(this.resource);

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
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ESQLDataset}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ESQLDataset> {
		private String name;

		private String dataSource;

		private String resource;

		@Nullable
		private String description;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private DatasetMapping mappings;

		public Builder() {
		}
		private Builder(ESQLDataset instance) {
			this.name = instance.name;
			this.dataSource = instance.dataSource;
			this.resource = instance.resource;
			this.description = instance.description;
			this.settings = instance.settings;
			this.mappings = instance.mappings;

		}
		/**
		 * Required - The dataset name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The name of the referenced data source.
		 * <p>
		 * API name: {@code data_source}
		 */
		public final Builder dataSource(String value) {
			this.dataSource = value;
			return this;
		}

		/**
		 * Required - The URI that identifies the data to read, resolved against the
		 * referenced data source. It can include glob patterns, for example a recursive
		 * pattern that matches Parquet files under
		 * <code>s3://logs-bucket/access</code>.
		 * <p>
		 * API name: {@code resource}
		 */
		public final Builder resource(String value) {
			this.resource = value;
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
		 * Format- and parsing-specific settings that configure how the resource is
		 * read. Common keys include <code>format</code> and
		 * <code>partition_detection</code>. Additional keys depend on the format
		 * reader; compression can be inferred from the resource URI.
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
		 * Format- and parsing-specific settings that configure how the resource is
		 * read. Common keys include <code>format</code> and
		 * <code>partition_detection</code>. Additional keys depend on the format
		 * reader; compression can be inferred from the resource URI.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		/**
		 * The user-declared mapping on the dataset definition.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable DatasetMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * The user-declared mapping on the dataset definition.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<DatasetMapping.Builder, ObjectBuilder<DatasetMapping>> fn) {
			return this.mappings(fn.apply(new DatasetMapping.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ESQLDataset}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ESQLDataset build() {
			_checkSingleUse();

			return new ESQLDataset(this);
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
	 * Json deserializer for {@link ESQLDataset}
	 */
	public static final JsonpDeserializer<ESQLDataset> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ESQLDataset::setupESQLDatasetDeserializer);

	protected static void setupESQLDatasetDeserializer(ObjectDeserializer<ESQLDataset.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::dataSource, JsonpDeserializer.stringDeserializer(), "data_source");
		op.add(Builder::resource, JsonpDeserializer.stringDeserializer(), "resource");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");
		op.add(Builder::mappings, DatasetMapping._DESERIALIZER, "mappings");

	}

}
