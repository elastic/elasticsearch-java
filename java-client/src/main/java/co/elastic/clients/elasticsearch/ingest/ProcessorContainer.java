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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ProcessorContainer extends TaggedUnion<ProcessorContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		attachment("attachment"),

		append("append"),

		csv("csv"),

		convert("convert"),

		date("date"),

		dateIndexName("date_index_name"),

		dotExpander("dot_expander"),

		enrich("enrich"),

		fail("fail"),

		foreach("foreach"),

		json("json"),

		userAgent("user_agent"),

		kv("kv"),

		geoip("geoip"),

		grok("grok"),

		gsub("gsub"),

		join("join"),

		lowercase("lowercase"),

		remove("remove"),

		rename("rename"),

		script("script"),

		set("set"),

		sort("sort"),

		split("split"),

		trim("trim"),

		uppercase("uppercase"),

		urldecode("urldecode"),

		bytes("bytes"),

		dissect("dissect"),

		setSecurityUser("set_security_user"),

		pipeline("pipeline"),

		drop("drop"),

		circle("circle"),

		inference("inference"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private ProcessorContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code attachment} kind?
	 */
	public boolean isAttachment() {
		return is(Tag.attachment);
	}

	/**
	 * Get the {@code attachment} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code attachment} kind.
	 */
	public AttachmentProcessor attachment() {
		return get(Tag.attachment);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code append} kind?
	 */
	public boolean isAppend() {
		return is(Tag.append);
	}

	/**
	 * Get the {@code append} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code append} kind.
	 */
	public AppendProcessor append() {
		return get(Tag.append);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code csv} kind?
	 */
	public boolean isCsv() {
		return is(Tag.csv);
	}

	/**
	 * Get the {@code csv} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code csv} kind.
	 */
	public CsvProcessor csv() {
		return get(Tag.csv);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code convert} kind?
	 */
	public boolean isConvert() {
		return is(Tag.convert);
	}

	/**
	 * Get the {@code convert} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code convert} kind.
	 */
	public ConvertProcessor convert() {
		return get(Tag.convert);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code date} kind?
	 */
	public boolean isDate() {
		return is(Tag.date);
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateProcessor date() {
		return get(Tag.date);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code date_index_name} kind?
	 */
	public boolean isDateIndexName() {
		return is(Tag.dateIndexName);
	}

	/**
	 * Get the {@code date_index_name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_index_name}
	 *             kind.
	 */
	public DateIndexNameProcessor dateIndexName() {
		return get(Tag.dateIndexName);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code dot_expander} kind?
	 */
	public boolean isDotExpander() {
		return is(Tag.dotExpander);
	}

	/**
	 * Get the {@code dot_expander} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dot_expander} kind.
	 */
	public DotExpanderProcessor dotExpander() {
		return get(Tag.dotExpander);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code enrich} kind?
	 */
	public boolean isEnrich() {
		return is(Tag.enrich);
	}

	/**
	 * Get the {@code enrich} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code enrich} kind.
	 */
	public EnrichProcessor enrich() {
		return get(Tag.enrich);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code fail} kind?
	 */
	public boolean isFail() {
		return is(Tag.fail);
	}

	/**
	 * Get the {@code fail} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fail} kind.
	 */
	public FailProcessor fail() {
		return get(Tag.fail);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code foreach} kind?
	 */
	public boolean isForeach() {
		return is(Tag.foreach);
	}

	/**
	 * Get the {@code foreach} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code foreach} kind.
	 */
	public ForeachProcessor foreach() {
		return get(Tag.foreach);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code json} kind?
	 */
	public boolean isJson() {
		return is(Tag.json);
	}

	/**
	 * Get the {@code json} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code json} kind.
	 */
	public JsonProcessor json() {
		return get(Tag.json);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code user_agent} kind?
	 */
	public boolean isUserAgent() {
		return is(Tag.userAgent);
	}

	/**
	 * Get the {@code user_agent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code user_agent} kind.
	 */
	public UserAgentProcessor userAgent() {
		return get(Tag.userAgent);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code kv} kind?
	 */
	public boolean isKv() {
		return is(Tag.kv);
	}

	/**
	 * Get the {@code kv} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kv} kind.
	 */
	public KeyValueProcessor kv() {
		return get(Tag.kv);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code geoip} kind?
	 */
	public boolean isGeoip() {
		return is(Tag.geoip);
	}

	/**
	 * Get the {@code geoip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geoip} kind.
	 */
	public GeoIpProcessor geoip() {
		return get(Tag.geoip);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code grok} kind?
	 */
	public boolean isGrok() {
		return is(Tag.grok);
	}

	/**
	 * Get the {@code grok} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code grok} kind.
	 */
	public GrokProcessor grok() {
		return get(Tag.grok);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code gsub} kind?
	 */
	public boolean isGsub() {
		return is(Tag.gsub);
	}

	/**
	 * Get the {@code gsub} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gsub} kind.
	 */
	public GsubProcessor gsub() {
		return get(Tag.gsub);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code join} kind?
	 */
	public boolean isJoin() {
		return is(Tag.join);
	}

	/**
	 * Get the {@code join} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code join} kind.
	 */
	public JoinProcessor join() {
		return get(Tag.join);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code lowercase} kind?
	 */
	public boolean isLowercase() {
		return is(Tag.lowercase);
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseProcessor lowercase() {
		return get(Tag.lowercase);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code remove} kind?
	 */
	public boolean isRemove() {
		return is(Tag.remove);
	}

	/**
	 * Get the {@code remove} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove} kind.
	 */
	public RemoveProcessor remove() {
		return get(Tag.remove);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code rename} kind?
	 */
	public boolean isRename() {
		return is(Tag.rename);
	}

	/**
	 * Get the {@code rename} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rename} kind.
	 */
	public RenameProcessor rename() {
		return get(Tag.rename);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code script} kind?
	 */
	public boolean isScript() {
		return is(Tag.script);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public JsonValue script() {
		return get(Tag.script);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code set} kind?
	 */
	public boolean isSet() {
		return is(Tag.set);
	}

	/**
	 * Get the {@code set} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code set} kind.
	 */
	public SetProcessor set() {
		return get(Tag.set);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code sort} kind?
	 */
	public boolean isSort() {
		return is(Tag.sort);
	}

	/**
	 * Get the {@code sort} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sort} kind.
	 */
	public SortProcessor sort() {
		return get(Tag.sort);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code split} kind?
	 */
	public boolean isSplit() {
		return is(Tag.split);
	}

	/**
	 * Get the {@code split} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code split} kind.
	 */
	public SplitProcessor split() {
		return get(Tag.split);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code trim} kind?
	 */
	public boolean isTrim() {
		return is(Tag.trim);
	}

	/**
	 * Get the {@code trim} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trim} kind.
	 */
	public TrimProcessor trim() {
		return get(Tag.trim);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code uppercase} kind?
	 */
	public boolean isUppercase() {
		return is(Tag.uppercase);
	}

	/**
	 * Get the {@code uppercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uppercase} kind.
	 */
	public UppercaseProcessor uppercase() {
		return get(Tag.uppercase);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code urldecode} kind?
	 */
	public boolean isUrldecode() {
		return is(Tag.urldecode);
	}

	/**
	 * Get the {@code urldecode} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code urldecode} kind.
	 */
	public UrlDecodeProcessor urldecode() {
		return get(Tag.urldecode);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code bytes} kind?
	 */
	public boolean isBytes() {
		return is(Tag.bytes);
	}

	/**
	 * Get the {@code bytes} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bytes} kind.
	 */
	public BytesProcessor bytes() {
		return get(Tag.bytes);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code dissect} kind?
	 */
	public boolean isDissect() {
		return is(Tag.dissect);
	}

	/**
	 * Get the {@code dissect} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dissect} kind.
	 */
	public DissectProcessor dissect() {
		return get(Tag.dissect);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code set_security_user} kind?
	 */
	public boolean isSetSecurityUser() {
		return is(Tag.setSecurityUser);
	}

	/**
	 * Get the {@code set_security_user} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code set_security_user}
	 *             kind.
	 */
	public SetSecurityUserProcessor setSecurityUser() {
		return get(Tag.setSecurityUser);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code pipeline} kind?
	 */
	public boolean isPipeline() {
		return is(Tag.pipeline);
	}

	/**
	 * Get the {@code pipeline} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pipeline} kind.
	 */
	public PipelineProcessor pipeline() {
		return get(Tag.pipeline);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code drop} kind?
	 */
	public boolean isDrop() {
		return is(Tag.drop);
	}

	/**
	 * Get the {@code drop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code drop} kind.
	 */
	public JsonValue drop() {
		return get(Tag.drop);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code circle} kind?
	 */
	public boolean isCircle() {
		return is(Tag.circle);
	}

	/**
	 * Get the {@code circle} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code circle} kind.
	 */
	public CircleProcessor circle() {
		return get(Tag.circle);
	}

	/**
	 * Is this {@link ProcessorContainer} of a {@code inference} kind?
	 */
	public boolean isInference() {
		return is(Tag.inference);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceProcessor inference() {
		return get(Tag.inference);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case script :
					generator.write(this.<JsonValue>get(Tag.script));

					break;
				case drop :
					generator.write(this.<JsonValue>get(Tag.drop));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<ProcessorContainer> attachment(AttachmentProcessor v) {
			this.$variant = v;
			this.$tag = Tag.attachment;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> attachment(
				Function<AttachmentProcessor.Builder, ObjectBuilder<AttachmentProcessor>> f) {
			return this.attachment(f.apply(new AttachmentProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> append(AppendProcessor v) {
			this.$variant = v;
			this.$tag = Tag.append;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> append(
				Function<AppendProcessor.Builder, ObjectBuilder<AppendProcessor>> f) {
			return this.append(f.apply(new AppendProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> csv(CsvProcessor v) {
			this.$variant = v;
			this.$tag = Tag.csv;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> csv(Function<CsvProcessor.Builder, ObjectBuilder<CsvProcessor>> f) {
			return this.csv(f.apply(new CsvProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> convert(ConvertProcessor v) {
			this.$variant = v;
			this.$tag = Tag.convert;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> convert(
				Function<ConvertProcessor.Builder, ObjectBuilder<ConvertProcessor>> f) {
			return this.convert(f.apply(new ConvertProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> date(DateProcessor v) {
			this.$variant = v;
			this.$tag = Tag.date;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> date(Function<DateProcessor.Builder, ObjectBuilder<DateProcessor>> f) {
			return this.date(f.apply(new DateProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> dateIndexName(DateIndexNameProcessor v) {
			this.$variant = v;
			this.$tag = Tag.dateIndexName;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> dateIndexName(
				Function<DateIndexNameProcessor.Builder, ObjectBuilder<DateIndexNameProcessor>> f) {
			return this.dateIndexName(f.apply(new DateIndexNameProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> dotExpander(DotExpanderProcessor v) {
			this.$variant = v;
			this.$tag = Tag.dotExpander;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> dotExpander(
				Function<DotExpanderProcessor.Builder, ObjectBuilder<DotExpanderProcessor>> f) {
			return this.dotExpander(f.apply(new DotExpanderProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> enrich(EnrichProcessor v) {
			this.$variant = v;
			this.$tag = Tag.enrich;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> enrich(
				Function<EnrichProcessor.Builder, ObjectBuilder<EnrichProcessor>> f) {
			return this.enrich(f.apply(new EnrichProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> fail(FailProcessor v) {
			this.$variant = v;
			this.$tag = Tag.fail;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> fail(Function<FailProcessor.Builder, ObjectBuilder<FailProcessor>> f) {
			return this.fail(f.apply(new FailProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> foreach(ForeachProcessor v) {
			this.$variant = v;
			this.$tag = Tag.foreach;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> foreach(
				Function<ForeachProcessor.Builder, ObjectBuilder<ForeachProcessor>> f) {
			return this.foreach(f.apply(new ForeachProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> json(JsonProcessor v) {
			this.$variant = v;
			this.$tag = Tag.json;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> json(Function<JsonProcessor.Builder, ObjectBuilder<JsonProcessor>> f) {
			return this.json(f.apply(new JsonProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> userAgent(UserAgentProcessor v) {
			this.$variant = v;
			this.$tag = Tag.userAgent;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> userAgent(
				Function<UserAgentProcessor.Builder, ObjectBuilder<UserAgentProcessor>> f) {
			return this.userAgent(f.apply(new UserAgentProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> kv(KeyValueProcessor v) {
			this.$variant = v;
			this.$tag = Tag.kv;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> kv(
				Function<KeyValueProcessor.Builder, ObjectBuilder<KeyValueProcessor>> f) {
			return this.kv(f.apply(new KeyValueProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> geoip(GeoIpProcessor v) {
			this.$variant = v;
			this.$tag = Tag.geoip;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> geoip(
				Function<GeoIpProcessor.Builder, ObjectBuilder<GeoIpProcessor>> f) {
			return this.geoip(f.apply(new GeoIpProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> grok(GrokProcessor v) {
			this.$variant = v;
			this.$tag = Tag.grok;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> grok(Function<GrokProcessor.Builder, ObjectBuilder<GrokProcessor>> f) {
			return this.grok(f.apply(new GrokProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> gsub(GsubProcessor v) {
			this.$variant = v;
			this.$tag = Tag.gsub;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> gsub(Function<GsubProcessor.Builder, ObjectBuilder<GsubProcessor>> f) {
			return this.gsub(f.apply(new GsubProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> join(JoinProcessor v) {
			this.$variant = v;
			this.$tag = Tag.join;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> join(Function<JoinProcessor.Builder, ObjectBuilder<JoinProcessor>> f) {
			return this.join(f.apply(new JoinProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> lowercase(LowercaseProcessor v) {
			this.$variant = v;
			this.$tag = Tag.lowercase;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> lowercase(
				Function<LowercaseProcessor.Builder, ObjectBuilder<LowercaseProcessor>> f) {
			return this.lowercase(f.apply(new LowercaseProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> remove(RemoveProcessor v) {
			this.$variant = v;
			this.$tag = Tag.remove;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> remove(
				Function<RemoveProcessor.Builder, ObjectBuilder<RemoveProcessor>> f) {
			return this.remove(f.apply(new RemoveProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> rename(RenameProcessor v) {
			this.$variant = v;
			this.$tag = Tag.rename;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> rename(
				Function<RenameProcessor.Builder, ObjectBuilder<RenameProcessor>> f) {
			return this.rename(f.apply(new RenameProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> script(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.script;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> set(SetProcessor v) {
			this.$variant = v;
			this.$tag = Tag.set;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> set(Function<SetProcessor.Builder, ObjectBuilder<SetProcessor>> f) {
			return this.set(f.apply(new SetProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> sort(SortProcessor v) {
			this.$variant = v;
			this.$tag = Tag.sort;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> sort(Function<SortProcessor.Builder, ObjectBuilder<SortProcessor>> f) {
			return this.sort(f.apply(new SortProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> split(SplitProcessor v) {
			this.$variant = v;
			this.$tag = Tag.split;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> split(
				Function<SplitProcessor.Builder, ObjectBuilder<SplitProcessor>> f) {
			return this.split(f.apply(new SplitProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> trim(TrimProcessor v) {
			this.$variant = v;
			this.$tag = Tag.trim;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> trim(Function<TrimProcessor.Builder, ObjectBuilder<TrimProcessor>> f) {
			return this.trim(f.apply(new TrimProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> uppercase(UppercaseProcessor v) {
			this.$variant = v;
			this.$tag = Tag.uppercase;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> uppercase(
				Function<UppercaseProcessor.Builder, ObjectBuilder<UppercaseProcessor>> f) {
			return this.uppercase(f.apply(new UppercaseProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> urldecode(UrlDecodeProcessor v) {
			this.$variant = v;
			this.$tag = Tag.urldecode;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> urldecode(
				Function<UrlDecodeProcessor.Builder, ObjectBuilder<UrlDecodeProcessor>> f) {
			return this.urldecode(f.apply(new UrlDecodeProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> bytes(BytesProcessor v) {
			this.$variant = v;
			this.$tag = Tag.bytes;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> bytes(
				Function<BytesProcessor.Builder, ObjectBuilder<BytesProcessor>> f) {
			return this.bytes(f.apply(new BytesProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> dissect(DissectProcessor v) {
			this.$variant = v;
			this.$tag = Tag.dissect;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> dissect(
				Function<DissectProcessor.Builder, ObjectBuilder<DissectProcessor>> f) {
			return this.dissect(f.apply(new DissectProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> setSecurityUser(SetSecurityUserProcessor v) {
			this.$variant = v;
			this.$tag = Tag.setSecurityUser;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> setSecurityUser(
				Function<SetSecurityUserProcessor.Builder, ObjectBuilder<SetSecurityUserProcessor>> f) {
			return this.setSecurityUser(f.apply(new SetSecurityUserProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> pipeline(PipelineProcessor v) {
			this.$variant = v;
			this.$tag = Tag.pipeline;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> pipeline(
				Function<PipelineProcessor.Builder, ObjectBuilder<PipelineProcessor>> f) {
			return this.pipeline(f.apply(new PipelineProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> drop(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.drop;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> circle(CircleProcessor v) {
			this.$variant = v;
			this.$tag = Tag.circle;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> circle(
				Function<CircleProcessor.Builder, ObjectBuilder<CircleProcessor>> f) {
			return this.circle(f.apply(new CircleProcessor.Builder()).build());
		}

		public ObjectBuilder<ProcessorContainer> inference(InferenceProcessor v) {
			this.$variant = v;
			this.$tag = Tag.inference;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ProcessorContainer> inference(
				Function<InferenceProcessor.Builder, ObjectBuilder<InferenceProcessor>> f) {
			return this.inference(f.apply(new InferenceProcessor.Builder()).build());
		}

		protected ProcessorContainer build() {
			return new ProcessorContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<ProcessorContainer> DESERIALIZER = JsonpDeserializer
			.lazy(ProcessorContainer::buildDeserializer);

	private static JsonpDeserializer<ProcessorContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::attachment, AttachmentProcessor.DESERIALIZER, "attachment");
		op.add(Builder::append, AppendProcessor.DESERIALIZER, "append");
		op.add(Builder::csv, CsvProcessor.DESERIALIZER, "csv");
		op.add(Builder::convert, ConvertProcessor.DESERIALIZER, "convert");
		op.add(Builder::date, DateProcessor.DESERIALIZER, "date");
		op.add(Builder::dateIndexName, DateIndexNameProcessor.DESERIALIZER, "date_index_name");
		op.add(Builder::dotExpander, DotExpanderProcessor.DESERIALIZER, "dot_expander");
		op.add(Builder::enrich, EnrichProcessor.DESERIALIZER, "enrich");
		op.add(Builder::fail, FailProcessor.DESERIALIZER, "fail");
		op.add(Builder::foreach, ForeachProcessor.DESERIALIZER, "foreach");
		op.add(Builder::json, JsonProcessor.DESERIALIZER, "json");
		op.add(Builder::userAgent, UserAgentProcessor.DESERIALIZER, "user_agent");
		op.add(Builder::kv, KeyValueProcessor.DESERIALIZER, "kv");
		op.add(Builder::geoip, GeoIpProcessor.DESERIALIZER, "geoip");
		op.add(Builder::grok, GrokProcessor.DESERIALIZER, "grok");
		op.add(Builder::gsub, GsubProcessor.DESERIALIZER, "gsub");
		op.add(Builder::join, JoinProcessor.DESERIALIZER, "join");
		op.add(Builder::lowercase, LowercaseProcessor.DESERIALIZER, "lowercase");
		op.add(Builder::remove, RemoveProcessor.DESERIALIZER, "remove");
		op.add(Builder::rename, RenameProcessor.DESERIALIZER, "rename");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::set, SetProcessor.DESERIALIZER, "set");
		op.add(Builder::sort, SortProcessor.DESERIALIZER, "sort");
		op.add(Builder::split, SplitProcessor.DESERIALIZER, "split");
		op.add(Builder::trim, TrimProcessor.DESERIALIZER, "trim");
		op.add(Builder::uppercase, UppercaseProcessor.DESERIALIZER, "uppercase");
		op.add(Builder::urldecode, UrlDecodeProcessor.DESERIALIZER, "urldecode");
		op.add(Builder::bytes, BytesProcessor.DESERIALIZER, "bytes");
		op.add(Builder::dissect, DissectProcessor.DESERIALIZER, "dissect");
		op.add(Builder::setSecurityUser, SetSecurityUserProcessor.DESERIALIZER, "set_security_user");
		op.add(Builder::pipeline, PipelineProcessor.DESERIALIZER, "pipeline");
		op.add(Builder::drop, JsonpDeserializer.jsonValueDeserializer(), "drop");
		op.add(Builder::circle, CircleProcessor.DESERIALIZER, "circle");
		op.add(Builder::inference, InferenceProcessor.DESERIALIZER, "inference");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
