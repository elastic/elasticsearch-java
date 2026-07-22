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

// typedef: esql._types.DatasetMapping

/**
 * A user-declared mapping (the <code>mappings</code> block) attached to a
 * dataset. It is entirely optional: a dataset with no declared mapping relies
 * on inference.
 * 
 * @see <a href="../doc-files/api-spec.html#esql._types.DatasetMapping">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatasetMapping implements JsonpSerializable {
	@Nullable
	private final Dynamic dynamic;

	private final Map<String, DatasetFieldMapping> properties;

	@Nullable
	private final IdPath id;

	// ---------------------------------------------------------------------------------------------

	private DatasetMapping(Builder builder) {

		this.dynamic = builder.dynamic;
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);
		this.id = builder.id;

	}

	public static DatasetMapping of(Function<Builder, ObjectBuilder<DatasetMapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The policy for columns that are not declared in <code>properties</code>.
	 * <code>true</code> (the default) infers undeclared columns and overlays the
	 * declarations; <code>false</code> makes the declaration the entire schema, so
	 * undeclared columns are not queryable.
	 * <p>
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final Dynamic dynamic() {
		return this.dynamic;
	}

	/**
	 * The per-column declarations, keyed by logical column name.
	 * <p>
	 * API name: {@code properties}
	 */
	public final Map<String, DatasetFieldMapping> properties() {
		return this.properties;
	}

	/**
	 * The <code>_id</code> meta-field configuration, sourcing the document identity
	 * from a column.
	 * <p>
	 * API name: {@code _id}
	 */
	@Nullable
	public final IdPath id() {
		return this.id;
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

		if (this.dynamic != null) {
			generator.writeKey("dynamic");
			this.dynamic.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, DatasetFieldMapping> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.id != null) {
			generator.writeKey("_id");
			this.id.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatasetMapping}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DatasetMapping> {
		@Nullable
		private Dynamic dynamic;

		@Nullable
		private Map<String, DatasetFieldMapping> properties;

		@Nullable
		private IdPath id;

		public Builder() {
		}
		private Builder(DatasetMapping instance) {
			this.dynamic = instance.dynamic;
			this.properties = instance.properties;
			this.id = instance.id;

		}
		/**
		 * The policy for columns that are not declared in <code>properties</code>.
		 * <code>true</code> (the default) infers undeclared columns and overlays the
		 * declarations; <code>false</code> makes the declaration the entire schema, so
		 * undeclared columns are not queryable.
		 * <p>
		 * API name: {@code dynamic}
		 */
		public final Builder dynamic(@Nullable Dynamic value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * The per-column declarations, keyed by logical column name.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>properties</code>.
		 */
		public final Builder properties(Map<String, DatasetFieldMapping> map) {
			this.properties = _mapPutAll(this.properties, map);
			return this;
		}

		/**
		 * The per-column declarations, keyed by logical column name.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code>.
		 */
		public final Builder properties(String key, DatasetFieldMapping value) {
			this.properties = _mapPut(this.properties, key, value);
			return this;
		}

		/**
		 * The per-column declarations, keyed by logical column name.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code> using a builder lambda.
		 */
		public final Builder properties(String key,
				Function<DatasetFieldMapping.Builder, ObjectBuilder<DatasetFieldMapping>> fn) {
			return properties(key, fn.apply(new DatasetFieldMapping.Builder()).build());
		}

		/**
		 * The <code>_id</code> meta-field configuration, sourcing the document identity
		 * from a column.
		 * <p>
		 * API name: {@code _id}
		 */
		public final Builder id(@Nullable IdPath value) {
			this.id = value;
			return this;
		}

		/**
		 * The <code>_id</code> meta-field configuration, sourcing the document identity
		 * from a column.
		 * <p>
		 * API name: {@code _id}
		 */
		public final Builder id(Function<IdPath.Builder, ObjectBuilder<IdPath>> fn) {
			return this.id(fn.apply(new IdPath.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatasetMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatasetMapping build() {
			_checkSingleUse();

			return new DatasetMapping(this);
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
	 * Json deserializer for {@link DatasetMapping}
	 */
	public static final JsonpDeserializer<DatasetMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DatasetMapping::setupDatasetMappingDeserializer);

	protected static void setupDatasetMappingDeserializer(ObjectDeserializer<DatasetMapping.Builder> op) {

		op.add(Builder::dynamic, Dynamic._DESERIALIZER, "dynamic");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(DatasetFieldMapping._DESERIALIZER),
				"properties");
		op.add(Builder::id, IdPath._DESERIALIZER, "_id");

	}

}
