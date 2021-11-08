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

package co.elastic.clients.elasticsearch.ccr;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow_stats.Response
@JsonpDeserializable
public class FollowStatsResponse implements JsonpSerializable {
	private final List<FollowIndexStats> indices;

	// ---------------------------------------------------------------------------------------------

	private FollowStatsResponse(Builder builder) {

		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static FollowStatsResponse of(Function<Builder, ObjectBuilder<FollowStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<FollowIndexStats> indices() {
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

		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (FollowIndexStats item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowStatsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FollowStatsResponse> {
		private List<FollowIndexStats> indices;

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<FollowIndexStats> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(FollowIndexStats... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		@SafeVarargs
		public final Builder indices(Function<FollowIndexStats.Builder, ObjectBuilder<FollowIndexStats>>... fns) {
			this.indices = new ArrayList<>(fns.length);
			for (Function<FollowIndexStats.Builder, ObjectBuilder<FollowIndexStats>> fn : fns) {
				this.indices.add(fn.apply(new FollowIndexStats.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link FollowStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowStatsResponse build() {
			_checkSingleUse();

			return new FollowStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowStatsResponse}
	 */
	public static final JsonpDeserializer<FollowStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FollowStatsResponse::setupFollowStatsResponseDeserializer, Builder::build);

	protected static void setupFollowStatsResponseDeserializer(DelegatingDeserializer<FollowStatsResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(FollowIndexStats._DESERIALIZER), "indices");

	}

}
