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

package co.elastic.clients.elasticsearch.snapshot;

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

// typedef: snapshot._types.InfoFeatureState
@JsonpDeserializable
public class InfoFeatureState implements JsonpSerializable {
	private final String featureName;

	private final List<String> indices;

	// ---------------------------------------------------------------------------------------------

	private InfoFeatureState(Builder builder) {

		this.featureName = ModelTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static InfoFeatureState of(Function<Builder, ObjectBuilder<InfoFeatureState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
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

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InfoFeatureState}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InfoFeatureState> {
		private String featureName;

		private List<String> indices;

		/**
		 * Required - API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link InfoFeatureState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InfoFeatureState build() {
			_checkSingleUse();

			return new InfoFeatureState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InfoFeatureState}
	 */
	public static final JsonpDeserializer<InfoFeatureState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InfoFeatureState::setupInfoFeatureStateDeserializer, Builder::build);

	protected static void setupInfoFeatureStateDeserializer(DelegatingDeserializer<InfoFeatureState.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");

	}

}
