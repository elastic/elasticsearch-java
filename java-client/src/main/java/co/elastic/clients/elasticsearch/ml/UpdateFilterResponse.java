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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_filter.Response
@JsonpDeserializable
public class UpdateFilterResponse implements JsonpSerializable {
	private final String description;

	private final String filterId;

	private final List<String> items;

	// ---------------------------------------------------------------------------------------------

	private UpdateFilterResponse(Builder builder) {

		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.filterId = ModelTypeHelper.requireNonNull(builder.filterId, this, "filterId");
		this.items = ModelTypeHelper.unmodifiableRequired(builder.items, this, "items");

	}

	public static UpdateFilterResponse of(Function<Builder, ObjectBuilder<UpdateFilterResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code filter_id}
	 */
	public final String filterId() {
		return this.filterId;
	}

	/**
	 * Required - API name: {@code items}
	 */
	public final List<String> items() {
		return this.items;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("filter_id");
		generator.write(this.filterId);

		if (ModelTypeHelper.isDefined(this.items)) {
			generator.writeKey("items");
			generator.writeStartArray();
			for (String item0 : this.items) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateFilterResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UpdateFilterResponse> {
		private String description;

		private String filterId;

		private List<String> items;

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter_id}
		 */
		public final Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		public final Builder items(List<String> value) {
			this.items = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		public final Builder items(String... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link UpdateFilterResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateFilterResponse build() {
			_checkSingleUse();

			return new UpdateFilterResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateFilterResponse}
	 */
	public static final JsonpDeserializer<UpdateFilterResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateFilterResponse::setupUpdateFilterResponseDeserializer, Builder::build);

	protected static void setupUpdateFilterResponseDeserializer(
			DelegatingDeserializer<UpdateFilterResponse.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::filterId, JsonpDeserializer.stringDeserializer(), "filter_id");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "items");

	}

}
