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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexTemplateDataStreamConfiguration

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexTemplateDataStreamConfiguration">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexTemplateDataStreamConfiguration implements JsonpSerializable {
	@Nullable
	private final Boolean hidden;

	@Nullable
	private final Boolean allowCustomRouting;

	// ---------------------------------------------------------------------------------------------

	private IndexTemplateDataStreamConfiguration(Builder builder) {

		this.hidden = builder.hidden;
		this.allowCustomRouting = builder.allowCustomRouting;

	}

	public static IndexTemplateDataStreamConfiguration of(
			Function<Builder, ObjectBuilder<IndexTemplateDataStreamConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, the data stream is hidden.
	 * <p>
	 * API name: {@code hidden}
	 */
	@Nullable
	public final Boolean hidden() {
		return this.hidden;
	}

	/**
	 * If true, the data stream supports custom routing.
	 * <p>
	 * API name: {@code allow_custom_routing}
	 */
	@Nullable
	public final Boolean allowCustomRouting() {
		return this.allowCustomRouting;
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

		if (this.hidden != null) {
			generator.writeKey("hidden");
			generator.write(this.hidden);

		}
		if (this.allowCustomRouting != null) {
			generator.writeKey("allow_custom_routing");
			generator.write(this.allowCustomRouting);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplateDataStreamConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexTemplateDataStreamConfiguration> {
		@Nullable
		private Boolean hidden;

		@Nullable
		private Boolean allowCustomRouting;

		/**
		 * If true, the data stream is hidden.
		 * <p>
		 * API name: {@code hidden}
		 */
		public final Builder hidden(@Nullable Boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * If true, the data stream supports custom routing.
		 * <p>
		 * API name: {@code allow_custom_routing}
		 */
		public final Builder allowCustomRouting(@Nullable Boolean value) {
			this.allowCustomRouting = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexTemplateDataStreamConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplateDataStreamConfiguration build() {
			_checkSingleUse();

			return new IndexTemplateDataStreamConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexTemplateDataStreamConfiguration}
	 */
	public static final JsonpDeserializer<IndexTemplateDataStreamConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					IndexTemplateDataStreamConfiguration::setupIndexTemplateDataStreamConfigurationDeserializer);

	protected static void setupIndexTemplateDataStreamConfigurationDeserializer(
			ObjectDeserializer<IndexTemplateDataStreamConfiguration.Builder> op) {

		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden");
		op.add(Builder::allowCustomRouting, JsonpDeserializer.booleanDeserializer(), "allow_custom_routing");

	}

}
