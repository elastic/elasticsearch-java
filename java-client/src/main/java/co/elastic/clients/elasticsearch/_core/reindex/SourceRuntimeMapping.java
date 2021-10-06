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

package co.elastic.clients.elasticsearch._core.reindex;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex.SourceRuntimeMapping
@JsonpDeserializable
public final class SourceRuntimeMapping implements JsonpSerializable {
	private final String type;

	@Nullable
	private final String script;

	// ---------------------------------------------------------------------------------------------

	public SourceRuntimeMapping(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.script = builder.script;

	}

	public SourceRuntimeMapping(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public String script() {
		return this.script;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SourceRuntimeMapping}.
	 */
	public static class Builder implements ObjectBuilder<SourceRuntimeMapping> {
		private String type;

		@Nullable
		private String script;

		/**
		 * Required - API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable String value) {
			this.script = value;
			return this;
		}

		/**
		 * Builds a {@link SourceRuntimeMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SourceRuntimeMapping build() {

			return new SourceRuntimeMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SourceRuntimeMapping}
	 */
	public static final JsonpDeserializer<SourceRuntimeMapping> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SourceRuntimeMapping::setupSourceRuntimeMappingDeserializer, Builder::build);

	protected static void setupSourceRuntimeMappingDeserializer(
			DelegatingDeserializer<SourceRuntimeMapping.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::script, JsonpDeserializer.stringDeserializer(), "script");

	}

}
