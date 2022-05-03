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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TopClassEntry

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TopClassEntry">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopClassEntry implements JsonpSerializable {
	private final String className;

	private final double classProbability;

	private final double classScore;

	// ---------------------------------------------------------------------------------------------

	private TopClassEntry(Builder builder) {

		this.className = ApiTypeHelper.requireNonNull(builder.className, this, "className");
		this.classProbability = ApiTypeHelper.requireNonNull(builder.classProbability, this, "classProbability");
		this.classScore = ApiTypeHelper.requireNonNull(builder.classScore, this, "classScore");

	}

	public static TopClassEntry of(Function<Builder, ObjectBuilder<TopClassEntry>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code class_name}
	 */
	public final String className() {
		return this.className;
	}

	/**
	 * Required - API name: {@code class_probability}
	 */
	public final double classProbability() {
		return this.classProbability;
	}

	/**
	 * Required - API name: {@code class_score}
	 */
	public final double classScore() {
		return this.classScore;
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

		generator.writeKey("class_name");
		generator.write(this.className);

		generator.writeKey("class_probability");
		generator.write(this.classProbability);

		generator.writeKey("class_score");
		generator.write(this.classScore);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopClassEntry}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TopClassEntry> {
		private String className;

		private Double classProbability;

		private Double classScore;

		/**
		 * Required - API name: {@code class_name}
		 */
		public final Builder className(String value) {
			this.className = value;
			return this;
		}

		/**
		 * Required - API name: {@code class_probability}
		 */
		public final Builder classProbability(double value) {
			this.classProbability = value;
			return this;
		}

		/**
		 * Required - API name: {@code class_score}
		 */
		public final Builder classScore(double value) {
			this.classScore = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopClassEntry}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopClassEntry build() {
			_checkSingleUse();

			return new TopClassEntry(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopClassEntry}
	 */
	public static final JsonpDeserializer<TopClassEntry> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TopClassEntry::setupTopClassEntryDeserializer);

	protected static void setupTopClassEntryDeserializer(ObjectDeserializer<TopClassEntry.Builder> op) {

		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");
		op.add(Builder::classProbability, JsonpDeserializer.doubleDeserializer(), "class_probability");
		op.add(Builder::classScore, JsonpDeserializer.doubleDeserializer(), "class_score");

	}

}
