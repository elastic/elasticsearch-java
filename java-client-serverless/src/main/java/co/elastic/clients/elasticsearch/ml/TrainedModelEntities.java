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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelEntities

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TrainedModelEntities">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelEntities implements JsonpSerializable {
	private final String className;

	private final double classProbability;

	private final String entity;

	private final int startPos;

	private final int endPos;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelEntities(Builder builder) {

		this.className = ApiTypeHelper.requireNonNull(builder.className, this, "className");
		this.classProbability = ApiTypeHelper.requireNonNull(builder.classProbability, this, "classProbability");
		this.entity = ApiTypeHelper.requireNonNull(builder.entity, this, "entity");
		this.startPos = ApiTypeHelper.requireNonNull(builder.startPos, this, "startPos");
		this.endPos = ApiTypeHelper.requireNonNull(builder.endPos, this, "endPos");

	}

	public static TrainedModelEntities of(Function<Builder, ObjectBuilder<TrainedModelEntities>> fn) {
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
	 * Required - API name: {@code entity}
	 */
	public final String entity() {
		return this.entity;
	}

	/**
	 * Required - API name: {@code start_pos}
	 */
	public final int startPos() {
		return this.startPos;
	}

	/**
	 * Required - API name: {@code end_pos}
	 */
	public final int endPos() {
		return this.endPos;
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

		generator.writeKey("entity");
		generator.write(this.entity);

		generator.writeKey("start_pos");
		generator.write(this.startPos);

		generator.writeKey("end_pos");
		generator.write(this.endPos);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelEntities}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelEntities> {
		private String className;

		private Double classProbability;

		private String entity;

		private Integer startPos;

		private Integer endPos;

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
		 * Required - API name: {@code entity}
		 */
		public final Builder entity(String value) {
			this.entity = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_pos}
		 */
		public final Builder startPos(int value) {
			this.startPos = value;
			return this;
		}

		/**
		 * Required - API name: {@code end_pos}
		 */
		public final Builder endPos(int value) {
			this.endPos = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelEntities}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelEntities build() {
			_checkSingleUse();

			return new TrainedModelEntities(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelEntities}
	 */
	public static final JsonpDeserializer<TrainedModelEntities> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelEntities::setupTrainedModelEntitiesDeserializer);

	protected static void setupTrainedModelEntitiesDeserializer(ObjectDeserializer<TrainedModelEntities.Builder> op) {

		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");
		op.add(Builder::classProbability, JsonpDeserializer.doubleDeserializer(), "class_probability");
		op.add(Builder::entity, JsonpDeserializer.stringDeserializer(), "entity");
		op.add(Builder::startPos, JsonpDeserializer.integerDeserializer(), "start_pos");
		op.add(Builder::endPos, JsonpDeserializer.integerDeserializer(), "end_pos");

	}

}
