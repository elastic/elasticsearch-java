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

package co.elastic.clients.elasticsearch.indices.get_data_stream;

import co.elastic.clients.elasticsearch._types.HealthStatus;
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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: indices.get_data_stream.IndicesGetDataStreamItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_stream.IndicesGetDataStreamItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesGetDataStreamItem implements JsonpSerializable {
	private final String name;

	private final IndicesGetDataStreamItemTimestampField timestampField;

	private final List<IndicesGetDataStreamItemIndex> indices;

	private final int generation;

	private final String template;

	private final boolean hidden;

	@Nullable
	private final Boolean system;

	private final HealthStatus status;

	@Nullable
	private final String ilmPolicy;

	private final Map<String, JsonData> meta;

	// ---------------------------------------------------------------------------------------------

	private IndicesGetDataStreamItem(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.timestampField = ApiTypeHelper.requireNonNull(builder.timestampField, this, "timestampField");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.generation = ApiTypeHelper.requireNonNull(builder.generation, this, "generation");
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");
		this.hidden = ApiTypeHelper.requireNonNull(builder.hidden, this, "hidden");
		this.system = builder.system;
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.ilmPolicy = builder.ilmPolicy;
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);

	}

	public static IndicesGetDataStreamItem of(Function<Builder, ObjectBuilder<IndicesGetDataStreamItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code timestamp_field}
	 */
	public final IndicesGetDataStreamItemTimestampField timestampField() {
		return this.timestampField;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<IndicesGetDataStreamItemIndex> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code generation}
	 */
	public final int generation() {
		return this.generation;
	}

	/**
	 * Required - API name: {@code template}
	 */
	public final String template() {
		return this.template;
	}

	/**
	 * Required - API name: {@code hidden}
	 */
	public final boolean hidden() {
		return this.hidden;
	}

	/**
	 * API name: {@code system}
	 */
	@Nullable
	public final Boolean system() {
		return this.system;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final HealthStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code ilm_policy}
	 */
	@Nullable
	public final String ilmPolicy() {
		return this.ilmPolicy;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
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

		generator.writeKey("timestamp_field");
		this.timestampField.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (IndicesGetDataStreamItemIndex item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("generation");
		generator.write(this.generation);

		generator.writeKey("template");
		generator.write(this.template);

		generator.writeKey("hidden");
		generator.write(this.hidden);

		if (this.system != null) {
			generator.writeKey("system");
			generator.write(this.system);

		}
		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (this.ilmPolicy != null) {
			generator.writeKey("ilm_policy");
			generator.write(this.ilmPolicy);

		}
		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
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
	 * Builder for {@link IndicesGetDataStreamItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndicesGetDataStreamItem> {
		private String name;

		private IndicesGetDataStreamItemTimestampField timestampField;

		private List<IndicesGetDataStreamItemIndex> indices;

		private Integer generation;

		private String template;

		private Boolean hidden;

		@Nullable
		private Boolean system;

		private HealthStatus status;

		@Nullable
		private String ilmPolicy;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp_field}
		 */
		public final Builder timestampField(IndicesGetDataStreamItemTimestampField value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp_field}
		 */
		public final Builder timestampField(
				Function<IndicesGetDataStreamItemTimestampField.Builder, ObjectBuilder<IndicesGetDataStreamItemTimestampField>> fn) {
			return this.timestampField(fn.apply(new IndicesGetDataStreamItemTimestampField.Builder()).build());
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<IndicesGetDataStreamItemIndex> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(IndicesGetDataStreamItemIndex value, IndicesGetDataStreamItemIndex... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(
				Function<IndicesGetDataStreamItemIndex.Builder, ObjectBuilder<IndicesGetDataStreamItemIndex>> fn) {
			return indices(fn.apply(new IndicesGetDataStreamItemIndex.Builder()).build());
		}

		/**
		 * Required - API name: {@code generation}
		 */
		public final Builder generation(int value) {
			this.generation = value;
			return this;
		}

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(String value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - API name: {@code hidden}
		 */
		public final Builder hidden(boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * API name: {@code system}
		 */
		public final Builder system(@Nullable Boolean value) {
			this.system = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(HealthStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code ilm_policy}
		 */
		public final Builder ilmPolicy(@Nullable String value) {
			this.ilmPolicy = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesGetDataStreamItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesGetDataStreamItem build() {
			_checkSingleUse();

			return new IndicesGetDataStreamItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesGetDataStreamItem}
	 */
	public static final JsonpDeserializer<IndicesGetDataStreamItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesGetDataStreamItem::setupIndicesGetDataStreamItemDeserializer);

	protected static void setupIndicesGetDataStreamItemDeserializer(
			ObjectDeserializer<IndicesGetDataStreamItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::timestampField, IndicesGetDataStreamItemTimestampField._DESERIALIZER, "timestamp_field");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesGetDataStreamItemIndex._DESERIALIZER),
				"indices");
		op.add(Builder::generation, JsonpDeserializer.integerDeserializer(), "generation");
		op.add(Builder::template, JsonpDeserializer.stringDeserializer(), "template");
		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden");
		op.add(Builder::system, JsonpDeserializer.booleanDeserializer(), "system");
		op.add(Builder::status, HealthStatus._DESERIALIZER, "status");
		op.add(Builder::ilmPolicy, JsonpDeserializer.stringDeserializer(), "ilm_policy");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");

	}

}
