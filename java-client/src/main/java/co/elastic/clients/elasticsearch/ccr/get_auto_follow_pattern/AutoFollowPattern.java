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

package co.elastic.clients.elasticsearch.ccr.get_auto_follow_pattern;

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

// typedef: ccr.get_auto_follow_pattern.AutoFollowPattern
@JsonpDeserializable
public final class AutoFollowPattern implements JsonpSerializable {
	private final String name;

	private final AutoFollowPatternSummary pattern;

	// ---------------------------------------------------------------------------------------------

	public AutoFollowPattern(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.pattern = Objects.requireNonNull(builder.pattern, "pattern");

	}

	public AutoFollowPattern(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code pattern}
	 */
	public AutoFollowPatternSummary pattern() {
		return this.pattern;
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

		generator.writeKey("pattern");
		this.pattern.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowPattern}.
	 */
	public static class Builder implements ObjectBuilder<AutoFollowPattern> {
		private String name;

		private AutoFollowPatternSummary pattern;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code pattern}
		 */
		public Builder pattern(AutoFollowPatternSummary value) {
			this.pattern = value;
			return this;
		}

		/**
		 * API name: {@code pattern}
		 */
		public Builder pattern(Function<AutoFollowPatternSummary.Builder, ObjectBuilder<AutoFollowPatternSummary>> fn) {
			return this.pattern(fn.apply(new AutoFollowPatternSummary.Builder()).build());
		}

		/**
		 * Builds a {@link AutoFollowPattern}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowPattern build() {

			return new AutoFollowPattern(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowPattern}
	 */
	public static final JsonpDeserializer<AutoFollowPattern> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoFollowPattern::setupAutoFollowPatternDeserializer, Builder::build);

	protected static void setupAutoFollowPatternDeserializer(DelegatingDeserializer<AutoFollowPattern.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::pattern, AutoFollowPatternSummary._DESERIALIZER, "pattern");

	}

}
