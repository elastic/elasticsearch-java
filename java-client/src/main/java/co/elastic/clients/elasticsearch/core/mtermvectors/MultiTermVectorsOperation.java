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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.mtermvectors;

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.termvectors.Filter;
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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Operation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.mtermvectors.Operation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiTermVectorsOperation implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final JsonData doc;

	private final List<String> fields;

	@Nullable
	private final Boolean fieldStatistics;

	@Nullable
	private final Filter filter;

	@Nullable
	private final Boolean offsets;

	@Nullable
	private final Boolean payloads;

	@Nullable
	private final Boolean positions;

	@Nullable
	private final String routing;

	@Nullable
	private final Boolean termStatistics;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	private MultiTermVectorsOperation(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = builder.index;
		this.doc = builder.doc;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.fieldStatistics = builder.fieldStatistics;
		this.filter = builder.filter;
		this.offsets = builder.offsets;
		this.payloads = builder.payloads;
		this.positions = builder.positions;
		this.routing = builder.routing;
		this.termStatistics = builder.termStatistics;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	public static MultiTermVectorsOperation of(Function<Builder, ObjectBuilder<MultiTermVectorsOperation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public final JsonData doc() {
		return this.doc;
	}

	/**
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code field_statistics}
	 */
	@Nullable
	public final Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public final Filter filter() {
		return this.filter;
	}

	/**
	 * API name: {@code offsets}
	 */
	@Nullable
	public final Boolean offsets() {
		return this.offsets;
	}

	/**
	 * API name: {@code payloads}
	 */
	@Nullable
	public final Boolean payloads() {
		return this.payloads;
	}

	/**
	 * API name: {@code positions}
	 */
	@Nullable
	public final Boolean positions() {
		return this.positions;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code term_statistics}
	 */
	@Nullable
	public final Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
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

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.index != null) {
			generator.writeKey("_index");
			generator.write(this.index);

		}
		if (this.doc != null) {
			generator.writeKey("doc");
			this.doc.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.fieldStatistics != null) {
			generator.writeKey("field_statistics");
			generator.write(this.fieldStatistics);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.offsets != null) {
			generator.writeKey("offsets");
			generator.write(this.offsets);

		}
		if (this.payloads != null) {
			generator.writeKey("payloads");
			generator.write(this.payloads);

		}
		if (this.positions != null) {
			generator.writeKey("positions");
			generator.write(this.positions);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.termStatistics != null) {
			generator.writeKey("term_statistics");
			generator.write(this.termStatistics);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionType != null) {
			generator.writeKey("version_type");
			this.versionType.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermVectorsOperation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MultiTermVectorsOperation> {
		private String id;

		@Nullable
		private String index;

		@Nullable
		private JsonData doc;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean fieldStatistics;

		@Nullable
		private Filter filter;

		@Nullable
		private Boolean offsets;

		@Nullable
		private Boolean payloads;

		@Nullable
		private Boolean positions;

		@Nullable
		private String routing;

		@Nullable
		private Boolean termStatistics;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(@Nullable JsonData value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * API name: {@code field_statistics}
		 */
		public final Builder fieldStatistics(@Nullable Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * API name: {@code offsets}
		 */
		public final Builder offsets(@Nullable Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * API name: {@code payloads}
		 */
		public final Builder payloads(@Nullable Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * API name: {@code positions}
		 */
		public final Builder positions(@Nullable Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code term_statistics}
		 */
		public final Builder termStatistics(@Nullable Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public final Builder versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermVectorsOperation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermVectorsOperation build() {
			_checkSingleUse();

			return new MultiTermVectorsOperation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiTermVectorsOperation}
	 */
	public static final JsonpDeserializer<MultiTermVectorsOperation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultiTermVectorsOperation::setupMultiTermVectorsOperationDeserializer);

	protected static void setupMultiTermVectorsOperationDeserializer(
			ObjectDeserializer<MultiTermVectorsOperation.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::doc, JsonData._DESERIALIZER, "doc");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::fieldStatistics, JsonpDeserializer.booleanDeserializer(), "field_statistics");
		op.add(Builder::filter, Filter._DESERIALIZER, "filter");
		op.add(Builder::offsets, JsonpDeserializer.booleanDeserializer(), "offsets");
		op.add(Builder::payloads, JsonpDeserializer.booleanDeserializer(), "payloads");
		op.add(Builder::positions, JsonpDeserializer.booleanDeserializer(), "positions");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::termStatistics, JsonpDeserializer.booleanDeserializer(), "term_statistics");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "version_type");

	}

}
