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

package co.elastic.clients.elasticsearch.cat.templates;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.templates.TemplatesRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.templates.TemplatesRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class TemplatesRecord implements JsonpSerializable {
	@Nullable
	private final String name;

	@Nullable
	private final String indexPatterns;

	@Nullable
	private final String order;

	@Nullable
	private final String version;

	@Nullable
	private final String composedOf;

	// ---------------------------------------------------------------------------------------------

	private TemplatesRecord(Builder builder) {

		this.name = builder.name;
		this.indexPatterns = builder.indexPatterns;
		this.order = builder.order;
		this.version = builder.version;
		this.composedOf = builder.composedOf;

	}

	public static TemplatesRecord of(Function<Builder, ObjectBuilder<TemplatesRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The template name.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * The template index patterns.
	 * <p>
	 * API name: {@code index_patterns}
	 */
	@Nullable
	public final String indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * The template application order or priority number.
	 * <p>
	 * API name: {@code order}
	 */
	@Nullable
	public final String order() {
		return this.order;
	}

	/**
	 * The template version.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * The component templates that comprise the index template.
	 * <p>
	 * API name: {@code composed_of}
	 */
	@Nullable
	public final String composedOf() {
		return this.composedOf;
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

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.indexPatterns != null) {
			generator.writeKey("index_patterns");
			generator.write(this.indexPatterns);

		}
		if (this.order != null) {
			generator.writeKey("order");
			generator.write(this.order);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.composedOf != null) {
			generator.writeKey("composed_of");
			generator.write(this.composedOf);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TemplatesRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TemplatesRecord> {
		@Nullable
		private String name;

		@Nullable
		private String indexPatterns;

		@Nullable
		private String order;

		@Nullable
		private String version;

		@Nullable
		private String composedOf;

		/**
		 * The template name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * The template index patterns.
		 * <p>
		 * API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(@Nullable String value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * The template application order or priority number.
		 * <p>
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable String value) {
			this.order = value;
			return this;
		}

		/**
		 * The template version.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * The component templates that comprise the index template.
		 * <p>
		 * API name: {@code composed_of}
		 */
		public final Builder composedOf(@Nullable String value) {
			this.composedOf = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TemplatesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TemplatesRecord build() {
			_checkSingleUse();

			return new TemplatesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TemplatesRecord}
	 */
	public static final JsonpDeserializer<TemplatesRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TemplatesRecord::setupTemplatesRecordDeserializer);

	protected static void setupTemplatesRecordDeserializer(ObjectDeserializer<TemplatesRecord.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name", "n");
		op.add(Builder::indexPatterns, JsonpDeserializer.stringDeserializer(), "index_patterns", "t");
		op.add(Builder::order, JsonpDeserializer.stringDeserializer(), "order", "o", "p");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::composedOf, JsonpDeserializer.stringDeserializer(), "composed_of", "c");

	}

}
