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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.LikeDocument
@JsonpDeserializable
public class LikeDocument implements JsonpSerializable {
	@Nullable
	private final JsonData doc;

	private final List<String> fields;

	@Nullable
	private final String id;

	@Nullable
	private final String type;

	@Nullable
	private final String index;

	private final Map<String, String> perFieldAnalyzer;

	@Nullable
	private final String routing;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	private LikeDocument(Builder builder) {

		this.doc = builder.doc;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.id = builder.id;
		this.type = builder.type;
		this.index = builder.index;
		this.perFieldAnalyzer = ModelTypeHelper.unmodifiable(builder.perFieldAnalyzer);
		this.routing = builder.routing;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	public static LikeDocument of(Function<Builder, ObjectBuilder<LikeDocument>> fn) {
		return fn.apply(new Builder()).build();
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
	 * API name: {@code _id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code per_field_analyzer}
	 */
	public final Map<String, String> perFieldAnalyzer() {
		return this.perFieldAnalyzer;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
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

		if (this.doc != null) {
			generator.writeKey("doc");
			this.doc.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.id != null) {
			generator.writeKey("_id");
			generator.write(this.id);

		}
		if (this.type != null) {
			generator.writeKey("_type");
			generator.write(this.type);

		}
		if (this.index != null) {
			generator.writeKey("_index");
			generator.write(this.index);

		}
		if (ModelTypeHelper.isDefined(this.perFieldAnalyzer)) {
			generator.writeKey("per_field_analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.perFieldAnalyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LikeDocument}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LikeDocument> {
		@Nullable
		private JsonData doc;

		@Nullable
		private List<String> fields;

		@Nullable
		private String id;

		@Nullable
		private String type;

		@Nullable
		private String index;

		@Nullable
		private Map<String, String> perFieldAnalyzer;

		@Nullable
		private String routing;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(@Nullable JsonData value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
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
		 * API name: {@code per_field_analyzer}
		 */
		public final Builder perFieldAnalyzer(@Nullable Map<String, String> value) {
			this.perFieldAnalyzer = value;
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

		/**
		 * Builds a {@link LikeDocument}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LikeDocument build() {
			_checkSingleUse();

			return new LikeDocument(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LikeDocument}
	 */
	public static final JsonpDeserializer<LikeDocument> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LikeDocument::setupLikeDocumentDeserializer, Builder::build);

	protected static void setupLikeDocumentDeserializer(DelegatingDeserializer<LikeDocument.Builder> op) {

		op.add(Builder::doc, JsonData._DESERIALIZER, "doc");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::perFieldAnalyzer,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "per_field_analyzer");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "version_type");

	}

}
