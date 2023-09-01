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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SettingsHighlight

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsHighlight">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsHighlight implements JsonpSerializable {
	@Nullable
	private final Integer maxAnalyzedOffset;

	// ---------------------------------------------------------------------------------------------

	private SettingsHighlight(Builder builder) {

		this.maxAnalyzedOffset = builder.maxAnalyzedOffset;

	}

	public static SettingsHighlight of(Function<Builder, ObjectBuilder<SettingsHighlight>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_analyzed_offset}
	 */
	@Nullable
	public final Integer maxAnalyzedOffset() {
		return this.maxAnalyzedOffset;
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

		if (this.maxAnalyzedOffset != null) {
			generator.writeKey("max_analyzed_offset");
			generator.write(this.maxAnalyzedOffset);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsHighlight}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SettingsHighlight> {
		@Nullable
		private Integer maxAnalyzedOffset;

		/**
		 * API name: {@code max_analyzed_offset}
		 */
		public final Builder maxAnalyzedOffset(@Nullable Integer value) {
			this.maxAnalyzedOffset = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsHighlight}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsHighlight build() {
			_checkSingleUse();

			return new SettingsHighlight(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsHighlight}
	 */
	public static final JsonpDeserializer<SettingsHighlight> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsHighlight::setupSettingsHighlightDeserializer);

	protected static void setupSettingsHighlightDeserializer(ObjectDeserializer<SettingsHighlight.Builder> op) {

		op.add(Builder::maxAnalyzedOffset, JsonpDeserializer.integerDeserializer(), "max_analyzed_offset");

	}

}
