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

package co.elastic.clients.elasticsearch._core.explain;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.explain.ExplanationDetail
@JsonpDeserializable
public final class ExplanationDetail implements JsonpSerializable {
	private final String description;

	@Nullable
	private final List<ExplanationDetail> details;

	private final Float value;

	// ---------------------------------------------------------------------------------------------

	public ExplanationDetail(Builder builder) {

		this.description = Objects.requireNonNull(builder.description, "description");
		this.details = builder.details;
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public List<ExplanationDetail> details() {
		return this.details;
	}

	/**
	 * API name: {@code value}
	 */
	public Float value() {
		return this.value;
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

		if (this.details != null) {

			generator.writeKey("details");
			generator.writeStartArray();
			for (ExplanationDetail item0 : this.details) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplanationDetail}.
	 */
	public static class Builder implements ObjectBuilder<ExplanationDetail> {
		private String description;

		@Nullable
		private List<ExplanationDetail> details;

		private Float value;

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public Builder details(@Nullable List<ExplanationDetail> value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public Builder details(ExplanationDetail... value) {
			this.details = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #details(List)}, creating the list if needed.
		 */
		public Builder addDetails(ExplanationDetail value) {
			if (this.details == null) {
				this.details = new ArrayList<>();
			}
			this.details.add(value);
			return this;
		}

		/**
		 * Set {@link #details(List)} to a singleton list.
		 */
		public Builder details(Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>> fn) {
			return this.details(fn.apply(new ExplanationDetail.Builder()).build());
		}

		/**
		 * Add a value to {@link #details(List)}, creating the list if needed.
		 */
		public Builder addDetails(Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>> fn) {
			return this.addDetails(fn.apply(new ExplanationDetail.Builder()).build());
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(Float value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link ExplanationDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplanationDetail build() {

			return new ExplanationDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExplanationDetail}
	 */
	public static final JsonpDeserializer<ExplanationDetail> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExplanationDetail::setupExplanationDetailDeserializer, Builder::build);

	protected static void setupExplanationDetailDeserializer(DelegatingDeserializer<ExplanationDetail.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::details, JsonpDeserializer.arrayDeserializer(ExplanationDetail._DESERIALIZER), "details");
		op.add(Builder::value, JsonpDeserializer.floatDeserializer(), "value");

	}

}
