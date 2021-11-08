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

package co.elastic.clients.elasticsearch.core.explain;

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
import java.lang.Float;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.explain.Explanation
@JsonpDeserializable
public class Explanation implements JsonpSerializable {
	private final String description;

	private final List<ExplanationDetail> details;

	private final float value;

	// ---------------------------------------------------------------------------------------------

	private Explanation(Builder builder) {

		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.details = ModelTypeHelper.unmodifiableRequired(builder.details, this, "details");
		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static Explanation of(Function<Builder, ObjectBuilder<Explanation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code details}
	 */
	public final List<ExplanationDetail> details() {
		return this.details;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final float value() {
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

		if (ModelTypeHelper.isDefined(this.details)) {
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
	 * Builder for {@link Explanation}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Explanation> {
		private String description;

		private List<ExplanationDetail> details;

		private Float value;

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code details}
		 */
		public final Builder details(List<ExplanationDetail> value) {
			this.details = value;
			return this;
		}

		/**
		 * Required - API name: {@code details}
		 */
		public final Builder details(ExplanationDetail... value) {
			this.details = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code details}
		 */
		@SafeVarargs
		public final Builder details(Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>>... fns) {
			this.details = new ArrayList<>(fns.length);
			for (Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>> fn : fns) {
				this.details.add(fn.apply(new ExplanationDetail.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(float value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link Explanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Explanation build() {
			_checkSingleUse();

			return new Explanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Explanation}
	 */
	public static final JsonpDeserializer<Explanation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Explanation::setupExplanationDeserializer, Builder::build);

	protected static void setupExplanationDeserializer(DelegatingDeserializer<Explanation.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::details, JsonpDeserializer.arrayDeserializer(ExplanationDetail._DESERIALIZER), "details");
		op.add(Builder::value, JsonpDeserializer.floatDeserializer(), "value");

	}

}
