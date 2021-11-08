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

package co.elastic.clients.elasticsearch.indices.close;

import co.elastic.clients.elasticsearch._types.ShardFailure;
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

// typedef: indices.close.CloseShardResult
@JsonpDeserializable
public class CloseShardResult implements JsonpSerializable {
	private final List<ShardFailure> failures;

	// ---------------------------------------------------------------------------------------------

	private CloseShardResult(Builder builder) {

		this.failures = ModelTypeHelper.unmodifiableRequired(builder.failures, this, "failures");

	}

	public static CloseShardResult of(Function<Builder, ObjectBuilder<CloseShardResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code failures}
	 */
	public final List<ShardFailure> failures() {
		return this.failures;
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

		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseShardResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CloseShardResult> {
		private List<ShardFailure> failures;

		/**
		 * Required - API name: {@code failures}
		 */
		public final Builder failures(List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		public final Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		@SafeVarargs
		public final Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>>... fns) {
			this.failures = new ArrayList<>(fns.length);
			for (Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn : fns) {
				this.failures.add(fn.apply(new ShardFailure.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link CloseShardResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseShardResult build() {
			_checkSingleUse();

			return new CloseShardResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseShardResult}
	 */
	public static final JsonpDeserializer<CloseShardResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CloseShardResult::setupCloseShardResultDeserializer, Builder::build);

	protected static void setupCloseShardResultDeserializer(DelegatingDeserializer<CloseShardResult.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure._DESERIALIZER), "failures");

	}

}
