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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.templates.TemplatesRecord
public final class TemplatesRecord implements ToJsonp {
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

	protected TemplatesRecord(Builder builder) {

		this.name = builder.name;
		this.indexPatterns = builder.indexPatterns;
		this.order = builder.order;
		this.version = builder.version;
		this.composedOf = builder.composedOf;

	}

	/**
	 * template name
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * template index patterns
	 *
	 * API name: {@code index_patterns}
	 */
	@Nullable
	public String indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * template application order/priority number
	 *
	 * API name: {@code order}
	 */
	@Nullable
	public String order() {
		return this.order;
	}

	/**
	 * version
	 *
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * component templates comprising index template
	 *
	 * API name: {@code composed_of}
	 */
	@Nullable
	public String composedOf() {
		return this.composedOf;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TemplatesRecord}.
	 */
	public static class Builder implements ObjectBuilder<TemplatesRecord> {
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
		 * template name
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * template index patterns
		 *
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(@Nullable String value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * template application order/priority number
		 *
		 * API name: {@code order}
		 */
		public Builder order(@Nullable String value) {
			this.order = value;
			return this;
		}

		/**
		 * version
		 *
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * component templates comprising index template
		 *
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(@Nullable String value) {
			this.composedOf = value;
			return this;
		}

		/**
		 * Builds a {@link TemplatesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TemplatesRecord build() {

			return new TemplatesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TemplatesRecord
	 */
	public static final JsonpDeserializer<TemplatesRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TemplatesRecord::setupTemplatesRecordDeserializer);

	protected static void setupTemplatesRecordDeserializer(DelegatingDeserializer<TemplatesRecord.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name", "n");
		op.add(Builder::indexPatterns, JsonpDeserializer.stringDeserializer(), "index_patterns", "t");
		op.add(Builder::order, JsonpDeserializer.stringDeserializer(), "order", "o", "p");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::composedOf, JsonpDeserializer.stringDeserializer(), "composed_of", "c");

	}

}
