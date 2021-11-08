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

package co.elastic.clients.elasticsearch.indices.get_index_template;

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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_index_template.IndexTemplate
@JsonpDeserializable
public class IndexTemplate implements JsonpSerializable {
	private final List<String> indexPatterns;

	private final List<String> composedOf;

	@Nullable
	private final IndexTemplateSummary template;

	@Nullable
	private final Long version;

	@Nullable
	private final Long priority;

	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean allowAutoCreate;

	private final Map<String, JsonData> dataStream;

	// ---------------------------------------------------------------------------------------------

	private IndexTemplate(Builder builder) {

		this.indexPatterns = ModelTypeHelper.unmodifiableRequired(builder.indexPatterns, this, "indexPatterns");
		this.composedOf = ModelTypeHelper.unmodifiableRequired(builder.composedOf, this, "composedOf");
		this.template = builder.template;
		this.version = builder.version;
		this.priority = builder.priority;
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.allowAutoCreate = builder.allowAutoCreate;
		this.dataStream = ModelTypeHelper.unmodifiable(builder.dataStream);

	}

	public static IndexTemplate of(Function<Builder, ObjectBuilder<IndexTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Required - API name: {@code composed_of}
	 */
	public final List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public final IndexTemplateSummary template() {
		return this.template;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public final Long priority() {
		return this.priority;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code allow_auto_create}
	 */
	@Nullable
	public final Boolean allowAutoCreate() {
		return this.allowAutoCreate;
	}

	/**
	 * API name: {@code data_stream}
	 */
	public final Map<String, JsonData> dataStream() {
		return this.dataStream;
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

		if (ModelTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.composedOf)) {
			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.priority != null) {
			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowAutoCreate != null) {
			generator.writeKey("allow_auto_create");
			generator.write(this.allowAutoCreate);

		}
		if (ModelTypeHelper.isDefined(this.dataStream)) {
			generator.writeKey("data_stream");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.dataStream.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplate}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexTemplate> {
		private List<String> indexPatterns;

		private List<String> composedOf;

		@Nullable
		private IndexTemplateSummary template;

		@Nullable
		private Long version;

		@Nullable
		private Long priority;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean allowAutoCreate;

		@Nullable
		private Map<String, JsonData> dataStream;

		/**
		 * Required - API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code composed_of}
		 */
		public final Builder composedOf(List<String> value) {
			this.composedOf = value;
			return this;
		}

		/**
		 * Required - API name: {@code composed_of}
		 */
		public final Builder composedOf(String... value) {
			this.composedOf = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable IndexTemplateSummary value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(Function<IndexTemplateSummary.Builder, ObjectBuilder<IndexTemplateSummary>> fn) {
			return this.template(fn.apply(new IndexTemplateSummary.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable Long value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public final Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * API name: {@code allow_auto_create}
		 */
		public final Builder allowAutoCreate(@Nullable Boolean value) {
			this.allowAutoCreate = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable Map<String, JsonData> value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * Builds a {@link IndexTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplate build() {
			_checkSingleUse();

			return new IndexTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexTemplate}
	 */
	public static final JsonpDeserializer<IndexTemplate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexTemplate::setupIndexTemplateDeserializer, Builder::build);

	protected static void setupIndexTemplateDeserializer(DelegatingDeserializer<IndexTemplate.Builder> op) {

		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::template, IndexTemplateSummary._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::priority, JsonpDeserializer.longDeserializer(), "priority");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::allowAutoCreate, JsonpDeserializer.booleanDeserializer(), "allow_auto_create");
		op.add(Builder::dataStream, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "data_stream");

	}

}
